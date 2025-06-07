package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ub extends oa {

    /* renamed from: y, reason: collision with root package name */
    private final Object f16257y;

    /* renamed from: z, reason: collision with root package name */
    private final ta f16258z;

    public ub(int i10, String str, ta taVar, sa saVar) {
        super(i10, str, saVar);
        this.f16257y = new Object();
        this.f16258z = taVar;
    }

    protected void E(String str) {
        ta taVar;
        synchronized (this.f16257y) {
            taVar = this.f16258z;
        }
        taVar.a(str);
    }

    @Override // com.google.android.gms.internal.ads.oa
    protected final ua m(ja jaVar) {
        String str;
        String str2;
        try {
            byte[] bArr = jaVar.f10397b;
            Map map = jaVar.f10398c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(jaVar.f10397b);
        }
        return ua.b(str, lb.b(jaVar));
    }
}
