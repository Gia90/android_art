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

package OptimizationTests.ShortMethodsInliningNonVirtualInvokes.InvokeDirectRangeAObjectThrowNullSet_001;
// The test checks that stack after NullPointerException occurs is correct despite inlining
class Main {
    final static int iterations = 10;

//    public static int getThingies(int i) {
//        return thingiesArray[i];
//    }
//  |[000194] Main.getThingies:(I)I
//  |0000: sget-object v0, LMain;.thingiesArray:[I // field@0001
//  |0002: aget v0, v0, v1
//  |0004: return v0

    public static void main(String[] args) {
        Test test = new Test(iterations);
        Foo nextThingy = new Foo();
        Foo g1 = new Foo();
        Foo g2 = new Foo();
        Foo g3 = new Foo();
        Foo g4 = new Foo();
        Foo g5 = new Foo();
        Foo g6 = new Foo();

        for(int i = 0; i < iterations; i++) {
            nextThingy = test.gimme(test.thingiesArray, i, g1, g2, g3, g4, g5, g6);
            test.hereyouare(test.thingiesArray, nextThingy, i, g1, g2, g3, g4, g5, g6);
        }

    }
}
