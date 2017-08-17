package com.fusheng.platform.common.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @author yk
 * @ClassName: DruidFilter
 * @Description: ${todo}
 * @date 2017/8/17 16:01
 */
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
		initParams={
				@WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
		}
)
public class DruidFilter extends WebStatFilter {

}