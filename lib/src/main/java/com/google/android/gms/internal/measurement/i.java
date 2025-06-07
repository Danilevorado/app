package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements q {

    /* renamed from: m, reason: collision with root package name */
    private final Double f18994m;

    public i(Double d10) {
        if (d10 == null) {
            this.f18994m = Double.valueOf(Double.NaN);
        } else {
            this.f18994m = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, r4 r4Var, List list) {
        if ("toString".equals(str)) {
            return new u(i());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", i(), str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f18994m.equals(((i) obj).f18994m);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q f() {
        return new i(this.f18994m);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double g() {
        return this.f18994m;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean h() {
        boolean z10 = false;
        if (!Double.isNaN(this.f18994m.doubleValue()) && this.f18994m.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public final int hashCode() {
        return this.f18994m.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String i() throws NumberFormatException {
        if (Double.isNaN(this.f18994m.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f18994m.doubleValue())) {
            return this.f18994m.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalStripTrailingZeros = BigDecimal.valueOf(this.f18994m.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalStripTrailingZeros.scale() > 0 ? bigDecimalStripTrailingZeros.precision() : bigDecimalStripTrailingZeros.scale()) - 1);
        String str = decimalFormat.format(bigDecimalStripTrailingZeros);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalStripTrailingZeros.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator l() {
        return null;
    }

    public final String toString() {
        return i();
    }
}
