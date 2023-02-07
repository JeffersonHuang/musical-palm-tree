/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,};
        PreSum preSum = new PreSum(arr);

        // [1,2] 的区间和
        int sum = preSum.query(1,2);
        System.out.println("App.main: " +sum);
    }
}