package example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestA
{
    @Test
    public void test()
    {
        System.out.println("=== RUN " + this.getClass().getSimpleName());
        assertThat(true, is(true));
    }
}
