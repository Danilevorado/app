package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ew1 implements nr2 {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f8007d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: a, reason: collision with root package name */
    private final String f8008a;

    /* renamed from: b, reason: collision with root package name */
    private final ot2 f8009b;

    /* renamed from: c, reason: collision with root package name */
    private final au2 f8010c;

    public ew1(String str, au2 au2Var, ot2 ot2Var) {
        this.f8008a = str;
        this.f8010c = au2Var;
        this.f8009b = ot2Var;
    }

    @Override // com.google.android.gms.internal.ads.nr2
    public final /* bridge */ /* synthetic */ Object a(Object obj) throws yq1 {
        yq1 yq1Var;
        String strConcat;
        dw1 dw1Var = (dw1) obj;
        int iOptInt = dw1Var.f7527a.optInt("http_timeout_millis", 60000);
        n90 n90Var = dw1Var.f7528b;
        String strJoin = "";
        if (n90Var.a() != -2) {
            if (n90Var.a() == 1) {
                if (n90Var.f() != null) {
                    strJoin = TextUtils.join(", ", n90Var.f());
                    ze0.d(strJoin);
                }
                yq1Var = new yq1(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                yq1Var = new yq1(1);
            }
            au2 au2Var = this.f8010c;
            ot2 ot2Var = this.f8009b;
            ot2Var.D0(yq1Var);
            ot2Var.B0(false);
            au2Var.a(ot2Var);
            throw yq1Var;
        }
        HashMap map = new HashMap();
        if (dw1Var.f7528b.h() && !TextUtils.isEmpty(this.f8008a)) {
            if (((Boolean) k3.w.c().b(ir.K0)).booleanValue()) {
                String str = this.f8008a;
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = f8007d.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            Locale locale = Locale.ROOT;
                            if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("; ");
                                }
                                strConcat = strConcat.concat(strGroup);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    map.put("Cookie", strConcat);
                }
            } else {
                map.put("Cookie", this.f8008a);
            }
        }
        if (dw1Var.f7528b.i()) {
            fw1.a(map, dw1Var.f7527a);
        }
        if (dw1Var.f7528b != null && !TextUtils.isEmpty(dw1Var.f7528b.d())) {
            strJoin = dw1Var.f7528b.d();
        }
        au2 au2Var2 = this.f8010c;
        ot2 ot2Var2 = this.f8009b;
        ot2Var2.B0(true);
        au2Var2.a(ot2Var2);
        return new zv1(dw1Var.f7528b.e(), iOptInt, map, strJoin.getBytes(u23.f16142c), "", dw1Var.f7528b.i());
    }
}
