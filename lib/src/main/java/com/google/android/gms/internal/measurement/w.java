package com.google.android.gms.internal.measurement;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends x {
    public w() {
        this.f19387a.add(n0.BITWISE_AND);
        this.f19387a.add(n0.BITWISE_LEFT_SHIFT);
        this.f19387a.add(n0.BITWISE_NOT);
        this.f19387a.add(n0.BITWISE_OR);
        this.f19387a.add(n0.BITWISE_RIGHT_SHIFT);
        this.f19387a.add(n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f19387a.add(n0.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, r4 r4Var, List list) {
        n0 n0Var = n0.ADD;
        switch (s5.e(str).ordinal()) {
            case 4:
                s5.h(n0.BITWISE_AND.name(), 2, list);
                return new i(Double.valueOf(s5.b(r4Var.b((q) list.get(0)).g().doubleValue()) & s5.b(r4Var.b((q) list.get(1)).g().doubleValue())));
            case 5:
                s5.h(n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(s5.b(r4Var.b((q) list.get(0)).g().doubleValue()) << ((int) (s5.d(r4Var.b((q) list.get(1)).g().doubleValue()) & 31))));
            case 6:
                s5.h(n0.BITWISE_NOT.name(), 1, list);
                return new i(Double.valueOf(~s5.b(r4Var.b((q) list.get(0)).g().doubleValue())));
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                s5.h(n0.BITWISE_OR.name(), 2, list);
                return new i(Double.valueOf(s5.b(r4Var.b((q) list.get(0)).g().doubleValue()) | s5.b(r4Var.b((q) list.get(1)).g().doubleValue())));
            case 8:
                s5.h(n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(s5.b(r4Var.b((q) list.get(0)).g().doubleValue()) >> ((int) (s5.d(r4Var.b((q) list.get(1)).g().doubleValue()) & 31))));
            case 9:
                s5.h(n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(s5.d(r4Var.b((q) list.get(0)).g().doubleValue()) >>> ((int) (s5.d(r4Var.b((q) list.get(1)).g().doubleValue()) & 31))));
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                s5.h(n0.BITWISE_XOR.name(), 2, list);
                return new i(Double.valueOf(s5.b(r4Var.b((q) list.get(0)).g().doubleValue()) ^ s5.b(r4Var.b((q) list.get(1)).g().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
