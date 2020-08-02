package com.york.user.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.york.user.dto.UserVO;
import com.york.user.remote.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author york
 * @create 2020-07-31 11:35
 **/
@Service
public class UserService {
    @Autowired
    private OrderService orderService;

    private Logger logger = LoggerFactory.getLogger(UserService.class);

    @PostConstruct
    public void initFlowRule() {
        List<FlowRule> rules = new ArrayList<>();
        FlowRule flowRule = new FlowRule("getUser");
        flowRule.setCount(2);
        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        flowRule.setCount(1);
        flowRule.setControlBehavior(RuleConstant.CONTROL_BEHAVIOR_RATE_LIMITER);
        rules.add(flowRule);
//        FlowRuleManager.loadRules(rules);

        List<DegradeRule> rules1 = new ArrayList<>();
        DegradeRule rule = new DegradeRule();
        rule.setResource("getUser");
        // set threshold RT, 10 ms
        rule.setCount(10);
        rule.setGrade(RuleConstant.DEGRADE_GRADE_RT);
        rule.setTimeWindow(10);
        rules1.add(rule);
        DegradeRuleManager.loadRules(rules1);
    }

    @SentinelResource(value = "getUser",blockHandler = "exceptionHandler")
    public UserVO getUser(Long userId) {
        logger.info("收到请求");
        UserVO userVO = new UserVO();
        userVO.setUserId(userId);
        userVO.setUserName("xxx" + userId);
//        Object o = orderService.getOrder();
//        userVO.setOrder(o);
//        throw new RuntimeException("sss");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userVO;
    }

    public UserVO exceptionHandler(Long userId, BlockException ex) {
        ex.printStackTrace();
        logger.info("异常处理");
        return new UserVO();
    }
}
