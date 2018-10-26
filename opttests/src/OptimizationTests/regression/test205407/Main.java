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

// Generated by Dalvik Fuzzer tool (2.1.003). Tue Jun 17 23:55:18 2014
package OptimizationTests.regression.test205407;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

public static final int N = 300;

static int statIntField = 3;
static void statSet(int value) {statIntField = value;}
static int  statGet() {return statIntField;}
public static long mgq_check_sum = 0;

public static void mgq(char e) {

    long fv[]=new long[N], uc[]=new long[N];
    short g7[]=new short[N];
    int ar8=-30545, vf=61113, x8=-35759, kbx=40029, f=56977, ye[][]=new int[N][N], w[]=new int[N];

    init(fv, 1845091595406372436L);
    init(g7, (short)-4684);
    init(uc, 6699617582523149342L);
    init(ye, -25553);
    init(w, -28787);

    ar8 = 0;
    switch ((int)ar8) {
        case 1:
            for (vf = 1; vf < 8; ++vf) {
                fv[vf-1] = (long)(fv[vf] - g7[vf]);
            }
            break;
    }

    int i = 211;
    do {
        int y = 11;
        while ( --y > 0 ) {
            for (x8 = 8; x8 > 1; x8--) {
                g7[x8] -= (short)(uc[x8]);
            }
        }

        for (kbx = 1; kbx < 16; kbx++) {
            for (f = 3; f > kbx; f--) {
                ar8 -= (int)(((ye[kbx-1][kbx-1]) + (w[kbx-1])) - 126);
            }
        }
    } while ( --i > 0 );

    mgq_check_sum += e + ar8 + vf + x8 + kbx + f + checkSum(fv) + checkSum(g7) + checkSum(uc) + checkSum(ye) +
        checkSum(w);
}

public static void main(String[] r) {

    long i57[]=new long[N], x[]=new long[N];
    int e=16418, em=16221, m=56865, d=37559, dp6=26916, a=63243, uku=-50779, r4=52558, pe=-61400, wh=-54145,
        ytp=-17240, i60=51399, tk=-19465, p3[]=new int[N], b[][]=new int[N][N], nof[]=new int[N], n[]=new int[N],
        w9[]=new int[N], y[][]=new int[N][N], k[][]=new int[N][N];

    init(p3, -25999);
    init(b, 20869);
    init(nof, -52369);
    init(n, -1017);
    init(i57, 4080308693316532394L);
    init(x, -3423677511769204698L);
    init(w9, -42543);
    init(y, -15889);
    init(k, 48931);

    int af = 11;
    do {
        for (e = 1; e < 20; e++) {
            p3[e+1] = (int)(38135);
        }
        for (em = 16; em > 1; --em) {
            for (m = 1; m < 13; m++) {
                b[m][em-1] = (int)(em - (++d));
            }
        }
    } while ( --af > 0 );

    int q1 = 11;
    while ( --q1 > 0 ) {
        for (dp6 = 14; dp6 > 1; --dp6) {
            p3[dp6+1] += (int)(m);
            nof[dp6+1] += (int)(p3[dp6] - p3[dp6]);
        }
        for (a = 1; a < 14; a++) {
            for (uku = 1; uku < 13; uku++) {
                n[a] = (int)((nof[uku-1]) - d);
            }
        }
        for (r4 = 1; r4 < 14; ++r4) {
            i57[r4-1] = (long)(34118);
            x[r4] = (long)((((nof[r4-1]) * (e)) + uku) % ((w9[r4+1] != 0) ? w9[r4+1] : 1));
        }
    }

    for (pe = 210; pe > 1; --pe) {
        if (wh > 0) continue;
        for (ytp = 1; ytp < 210; ytp++) {
            p3[pe-1] = (int)(++i60);
        }
        if ((d * (b[pe][pe])) / ((a != 0) ? a : 1) != statGet()) {
            mgq((char)(n[pe]));
            y[pe+1][pe+1] -= (int)((tk--) * uku);
            tk += (int)(k[pe-1][pe+1]);
        }
    }

    System.out.println("long: " + checkSum(i57) + "," + checkSum(x));
    System.out.println("int: " + e + "," + em + "," + m + "," + d + "," + dp6 + "," + a + "," + uku + "," + r4 + "," +
        pe + "," + wh + "," + ytp + "," + i60 + "," + tk + "," + checkSum(p3) + "," + checkSum(b) + "," + checkSum(nof)
        + "," + checkSum(n) + "," + checkSum(w9) + "," + checkSum(y) + "," + checkSum(k));

    System.out.println("mgq_check_sum: " + mgq_check_sum);
    System.out.println("statIntField: " + statIntField);
}
}
