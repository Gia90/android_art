/*
 * Copyright (C) 2015 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by Android Runtime Fuzzer tool (4.0.001). Tue Dec 15 14:32:54 2015
// srand = 4857575287377361234293540149231187624849725611613561074112173711689

package OptimizationTests.regression.test2972_2;

public class Main {

public static void main(String[] strArr) {

    float f=-98.105F, f1=100.12F;
    boolean b=false;
    byte by=51;
        double dd = 0;
    int i4=-7, i5=-20595;
    for (i4 = 1; i4 < 91; i4++) {
        dd -= 33 - f;
        for (f1 = 1; f1 < i4; f1++) {
            f -= (float)(dd);
            b = (b = (!(4 != (f--))));
        }
    }
    System.out.println("b: " + b);
}
}