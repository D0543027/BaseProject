package com.github.D0543027;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class D0543027Test {
    @Test
    public void getType() throws Exception {
        // Arrange
        D0543027 triangle = new D0543027(5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}
