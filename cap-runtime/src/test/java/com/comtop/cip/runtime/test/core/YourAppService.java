/******************************************************************************
 * Copyright (C) 2014 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/

package com.comtop.cip.runtime.test.core;

import com.comtop.cip.jodd.petite.meta.PetiteBean;

/**
 * 
 * 一个普通的AppService（测试用）
 * 
 * @author 柯尚福
 * @since 1.0
 * @version 2014-2-24 柯尚福
 */
@PetiteBean
public class YourAppService {
    
    /**
     * hello
     * 
     */
    public void hello() {
        System.out.println("hello,world");
    }
}
