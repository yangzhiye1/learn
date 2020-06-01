package com.example.springbootdeep.configuration.com.example.springbootdeep.configuration;

import com.example.springbootdeep.configuration.com.example.springbootdeep.annotation.ConditionalOnSystem;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

@Configuration
public class OnSystemCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        Map<String, Object> attrs = annotatedTypeMetadata.getAnnotationAttributes(ConditionalOnSystem.class.getName());
        System.out.println("------------------?system-->" + attrs.get("system"));

        return "linux".equals(attrs.get("system").toString());
    }
}
