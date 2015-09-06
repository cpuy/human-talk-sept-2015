package org.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.example.Main.main;

/**
 * @author laurentleseigneur
 */
public class MainTest {

    @Rule
    public ExpectedSystemExit expectedSystemExit = ExpectedSystemExit.none();

    @Test
    public void should_do_the_job() throws Exception {
        //given
        String[] args = {"HumanTalks"};

        //when
        main(args);

        //then
        //...how to check result ???

    }

    @Test
    public void should_also_do_the_job() throws Exception {
        //given
        String[] args = {"Human Talks"};

        //when
        main(args);

        //then
        //...how to check result ???

    }


    @Test
    public void should_not_do_the_job_with_null_parameter() throws Exception {
        //then
        expectedSystemExit.expectSystemExitWithStatus(1);

        //when
        main(null);

    }

    @Test
    public void should_not_do_the_job_with_empty_parameter() throws Exception {
        //given
        String[] args = {};

        //then
        expectedSystemExit.expectSystemExitWithStatus(1);

        //when
        main(null);


    }
}