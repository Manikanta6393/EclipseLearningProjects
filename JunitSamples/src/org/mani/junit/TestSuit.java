package org.mani.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	MessageUtilTest.class,
	MessageUtilTest2.class
})

public class TestSuit {

}
