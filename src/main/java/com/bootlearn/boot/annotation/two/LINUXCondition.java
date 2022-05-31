package com.bootlearn.boot.annotation.two;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther d
 * @Date 2022/4/16 11:49
 * @Describe
 **/
public class LINUXCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 获得注解@ConditionalOnLinux的所有属性
        List<AnnotationAttributes> allAnnotationAttributes = annotationAttributesFromMultiValueMap(
                metadata.getAllAnnotationAttributes(
                        ConditionalOnLinux.class.getName()));
        for (AnnotationAttributes annotationAttributes: allAnnotationAttributes) {
            // 获得注解@ConditionalOnLinux的environment属性
            String environment = annotationAttributes.getString("environment");
            // 若environment等于linux，则返回true
            if ("linux".equals(environment)) {
                return true;
            }
        }
        return false;
    }

    private List<AnnotationAttributes> annotationAttributesFromMultiValueMap(
            MultiValueMap<String, Object> multiValueMap) {
        List<Map<String, Object>> maps = new ArrayList<>();
        multiValueMap.forEach((key, value) -> {
            for (int i = 0; i < value.size(); i++) {
                Map<String, Object> map;
                if (i < maps.size()) {
                    map = maps.get(i);
                }
                else {
                    map = new HashMap<>();
                    maps.add(map);
                }
                map.put(key, value.get(i));
            }
        });
        List<AnnotationAttributes> annotationAttributes = new ArrayList<>(maps.size());
        for (Map<String, Object> map : maps) {
            annotationAttributes.add(AnnotationAttributes.fromMap(map));
        }
        return annotationAttributes;
    }
}
