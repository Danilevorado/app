package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f18338c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f18339a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f18340b = -1;

    private final boolean c(String str) throws NumberFormatException {
        Matcher matcher = f18338c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i10 = sv2.f15560a;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f18339a = i11;
            this.f18340b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a() {
        return (this.f18339a == -1 || this.f18340b == -1) ? false : true;
    }

    public final boolean b(ld0 ld0Var) {
        for (int i10 = 0; i10 < ld0Var.a(); i10++) {
            kc0 kc0VarB = ld0Var.b(i10);
            if (kc0VarB instanceof b3) {
                b3 b3Var = (b3) kc0VarB;
                if ("iTunSMPB".equals(b3Var.f6318o) && c(b3Var.f6319p)) {
                    return true;
                }
            } else if (kc0VarB instanceof l3) {
                l3 l3Var = (l3) kc0VarB;
                if ("com.apple.iTunes".equals(l3Var.f11308n) && "iTunSMPB".equals(l3Var.f11309o) && c(l3Var.f11310p)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
