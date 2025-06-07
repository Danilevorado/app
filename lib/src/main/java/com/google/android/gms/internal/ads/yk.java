package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public abstract class yk {
    static long a(long j10, int i10) {
        if (i10 == 1) {
            return j10;
        }
        return ((i10 & 1) == 0 ? a((j10 * j10) % 1073807359, i10 >> 1) : j10 * (a((j10 * j10) % 1073807359, i10 >> 1) % 1073807359)) % 1073807359;
    }

    static String b(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            ze0.d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i13 = i12 - 1;
            if (i10 >= i13) {
                sb2.append(strArr[i13]);
                return sb2.toString();
            }
            sb2.append(strArr[i10]);
            sb2.append(' ');
            i10++;
        }
    }

    public static void c(String[] strArr, int i10, int i11, PriorityQueue priorityQueue) throws UnsupportedEncodingException {
        int length = strArr.length;
        int i12 = 6;
        if (length < 6) {
            d(i10, e(strArr, 0, length), b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jE = e(strArr, 0, 6);
        d(i10, jE, b(strArr, 0, 6), 6, priorityQueue);
        int i13 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i13 >= length2 - 5) {
                return;
            }
            long jA = tk.a(strArr[i13 - 1]);
            long jA2 = tk.a(strArr[i13 + 5]);
            String strB = b(strArr, i13, i12);
            jE = ((((((jE + 1073807359) - ((a(16785407L, 5) * ((jA + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((jA2 + 2147483647L) % 1073807359)) % 1073807359;
            d(i10, jE, strB, length2, priorityQueue);
            i13++;
            i12 = 6;
        }
    }

    static void d(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        xk xkVar = new xk(j10, str, i11);
        if ((priorityQueue.size() != i10 || (((xk) priorityQueue.peek()).f17608c <= xkVar.f17608c && ((xk) priorityQueue.peek()).f17606a <= xkVar.f17606a)) && !priorityQueue.contains(xkVar)) {
            priorityQueue.add(xkVar);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    private static long e(String[] strArr, int i10, int i11) {
        long jA = (tk.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            jA = (((jA * 16785407) % 1073807359) + ((tk.a(strArr[i12]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jA;
    }
}
