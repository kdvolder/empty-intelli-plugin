package com.vmware;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.junit.Assert;
import org.junit.Test;

public class SimpleTest extends BasePlatformTestCase {


    public void testSomething() {
        Assert.assertNotNull(getProject());
//        Assert.fail("This should fail");
    }

}
