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

// Generated by Dalvik Fuzzer tool (3.4.001). Sat Dec 20 02:26:51 2014
package OptimizationTests.regression.test1078;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;


public static void main(String[] e1b) {

    int b7m=-50151, hk=-20878, ul=-11, us[]=new int[N];
    boolean y=false;
    long s=-6634932442050502394L, u6o[]=new long[N];
    double oun=14.232;
    float oik=-92.637F, qv[]=new float[N];

    init(us, 54967);
    init(u6o, 5509962726745086928L);
    init(qv, 93.854F);

    b7m = 1;
    do {
        oun += oun;
        s += (b7m * b7m);
        s -= (b7m - (--us[b7m]));
        for (int t : us) {
            hk = (int)(u6o[b7m] = (t--));
            for (ul = 1; ul < 17; ++ul) {
                t = (int)s;
                oik *= (float)((ul - s) - (oun--));
                us[b7m + 1] += ((hk--) & (++hk));
                y = y;
                if ((++s) <= (++oun)) {
                    hk /= (int)((long)(t += (int)(qv[b7m - 1] - (hk++))) | 1);
                } else if ((t++) != 59715) {
                    hk += ul;
                } else {
                    t += (-(t - (hk * ul)));
                    hk >>= (int)((--s) + (-(oun + b7m)));
                    s &= (t--);
                    us[ul + 1] <<= (++hk);
                }
                hk *= t;
                hk += (((ul * t) + t) - ul);
                s = (t = ((hk % -13877) * hk));
                switch ((b7m % 1) + 79) {
                case 79:
                    s = s;
                    us[ul - 1] <<= (int)(((oik * b7m) + (us[ul + 1]--)) - (ul + (oun + b7m)));
                    t -= (--us[b7m + 1]);
                }
            }
        }
    } while (++b7m < 87);

    System.out.println("b7m oun s = " + b7m + "," + Double.doubleToLongBits(oun) + "," + s);
    System.out.println("hk ul oik = " + hk + "," + ul + "," + Float.floatToIntBits(oik));
    System.out.println("y us u6o = " + (y ? 1 : 0) + "," + checkSum(us) + "," + checkSum(u6o));
    System.out.println("qv = " + Double.doubleToLongBits(checkSum(qv)));

}
}
