package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class sk {

    /* renamed from: a, reason: collision with root package name */
    private final int f15299a;

    /* renamed from: b, reason: collision with root package name */
    private final pk f15300b = new uk();

    public sk(int i10) {
        this.f15299a = i10;
    }

    public final String a(ArrayList arrayList) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] strArrSplit = sb2.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        rk rkVar = new rk();
        PriorityQueue priorityQueue = new PriorityQueue(this.f15299a, new qk(this));
        for (String str : strArrSplit) {
            String[] strArrB = tk.b(str, false);
            if (strArrB.length != 0) {
                yk.c(strArrB, this.f15299a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                rkVar.f14829b.write(this.f15300b.b(((xk) it.next()).f17607b));
            } catch (IOException e5) {
                ze0.e("Error while writing hash to byteStream", e5);
            }
        }
        return rkVar.toString();
    }
}
