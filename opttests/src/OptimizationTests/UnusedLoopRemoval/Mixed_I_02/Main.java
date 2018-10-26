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

package OptimizationTests.UnusedLoopRemoval.Mixed_I_02;

public class Main {

    // Test a loop that has invariants and an invoke

    class Test {

        int square(int i) {
            return i * i;
        }
    }

    public int loop() {
        int used1 = 1;
        int used2 = 2;
        int used3 = 3;
        int used4 = 4;
        int res = 0;
        int invar1 = 15;
        int invar2 = 25;
        int invar3 = 35;
        int invar4 = 45;


        Test t = new Test();
        for (int i = 0; i < 10000; i++) {
            used1 += invar1 + invar2;
            used2 -= invar2 - invar3;
            used3 /= invar3 + invar4;
            used4 += invar1 - invar2 - invar3 + invar4;
            res += t.square(i) + invar4;
        }
        return res;
    }

    public static void main(String[] args) {
        int res = new Main().loop();
        System.out.println(res);
    }
}
