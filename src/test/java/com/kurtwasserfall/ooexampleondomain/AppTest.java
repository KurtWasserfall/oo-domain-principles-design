package com.kurtwasserfall.ooexampleondomain;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
@author kurt wasserfall 211150142 3B
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
    Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
