
package com.bootlearn.boot.lifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.CustomEditorConfigurer;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Auther d
 * @Date 2022/2/16 11:34
 * @Describe 演示 {@link org.springframework.beans.factory.config.BeanFactoryPostProcessor},
 *           {@link org.springframework.beans.factory.config.CustomEditorConfigurer}spring
 *           的生命周期和 {@link java.beans.PropertyEditor}属性编辑器;
 *           这个类放弃实现
 **/
public class MyCustomEditorConfigurerBeanFactoryPostProcessor extends CustomEditorConfigurer {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("用到BeanFactoryPostProcessor接口的属性编辑器执行了");
    }

}
//完成String类型的日期转化为yyyy/MM/dd的形式
class DatePropertyEditor extends PropertyEditorSupport{

    private String datePattern;

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern(getDatePattern());
        DateFormat fmt =new SimpleDateFormat(getDatePattern());
        Date date = null;
        try {
            date = fmt.parse(text);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        setValue(date);
    }

    public String getDatePattern() {
        return datePattern;
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }
}
