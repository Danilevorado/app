package com.google.android.gms.internal.measurement;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static q a(String str, f fVar, r4 r4Var, List list) {
        String str2;
        char c10;
        String strI;
        j jVar;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c10 = 18;
                    break;
                } else {
                    c10 = 65535;
                    break;
                }
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c10 = 0;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c10 = 2;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c10 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c10 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c10 = 3;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c10 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c10 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c10 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c10 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c10 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c10 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c10 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c10 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c10 = 1;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c10 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c10 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c10 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c10 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c10 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            default:
                str2 = "toString";
                c10 = 65535;
                break;
        }
        double dN = 0.0d;
        switch (c10) {
            case 0:
                q qVarF = fVar.f();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        q qVarB = r4Var.b((q) it.next());
                        if (qVarB instanceof h) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        f fVar2 = (f) qVarF;
                        int iN = fVar2.n();
                        if (qVarB instanceof f) {
                            f fVar3 = (f) qVarB;
                            Iterator itQ = fVar3.q();
                            while (itQ.hasNext()) {
                                Integer num = (Integer) itQ.next();
                                fVar2.x(num.intValue() + iN, fVar3.o(num.intValue()));
                            }
                        } else {
                            fVar2.x(iN, qVarB);
                        }
                    }
                }
                return qVarF;
            case 1:
                s5.h("every", 1, list);
                q qVarB2 = r4Var.b((q) list.get(0));
                if (qVarB2 instanceof p) {
                    return (fVar.n() == 0 || b(fVar, r4Var, (p) qVarB2, Boolean.FALSE, Boolean.TRUE).n() == fVar.n()) ? q.f19198g : q.f19199h;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                s5.h("filter", 1, list);
                q qVarB3 = r4Var.b((q) list.get(0));
                if (!(qVarB3 instanceof p)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (fVar.k() == 0) {
                    return new f();
                }
                q qVarF2 = fVar.f();
                f fVarB = b(fVar, r4Var, (p) qVarB3, null, Boolean.TRUE);
                f fVar4 = new f();
                Iterator itQ2 = fVarB.q();
                while (itQ2.hasNext()) {
                    fVar4.x(fVar4.n(), ((f) qVarF2).o(((Integer) itQ2.next()).intValue()));
                }
                return fVar4;
            case 3:
                s5.h("forEach", 1, list);
                q qVarB4 = r4Var.b((q) list.get(0));
                if (!(qVarB4 instanceof p)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (fVar.k() != 0) {
                    b(fVar, r4Var, (p) qVarB4, null, null);
                }
                return q.f19193b;
            case 4:
                s5.j("indexOf", 2, list);
                q qVarB5 = q.f19193b;
                if (!list.isEmpty()) {
                    qVarB5 = r4Var.b((q) list.get(0));
                }
                if (list.size() > 1) {
                    double dA = s5.a(r4Var.b((q) list.get(1)).g().doubleValue());
                    if (dA >= fVar.n()) {
                        return new i(Double.valueOf(-1.0d));
                    }
                    dN = dA < 0.0d ? fVar.n() + dA : dA;
                }
                Iterator itQ3 = fVar.q();
                while (itQ3.hasNext()) {
                    int iIntValue = ((Integer) itQ3.next()).intValue();
                    double d10 = iIntValue;
                    if (d10 >= dN && s5.l(fVar.o(iIntValue), qVarB5)) {
                        return new i(Double.valueOf(d10));
                    }
                }
                return new i(Double.valueOf(-1.0d));
            case 5:
                s5.j("join", 1, list);
                if (fVar.n() == 0) {
                    return q.f19200i;
                }
                if (list.isEmpty()) {
                    strI = ",";
                } else {
                    q qVarB6 = r4Var.b((q) list.get(0));
                    strI = ((qVarB6 instanceof o) || (qVarB6 instanceof v)) ? "" : qVarB6.i();
                }
                return new u(fVar.p(strI));
            case 6:
                s5.j("lastIndexOf", 2, list);
                q qVarB7 = q.f19193b;
                if (!list.isEmpty()) {
                    qVarB7 = r4Var.b((q) list.get(0));
                }
                double dN2 = fVar.n() - 1;
                if (list.size() > 1) {
                    q qVarB8 = r4Var.b((q) list.get(1));
                    dN2 = Double.isNaN(qVarB8.g().doubleValue()) ? fVar.n() - 1 : s5.a(qVarB8.g().doubleValue());
                    if (dN2 < 0.0d) {
                        dN2 += fVar.n();
                    }
                }
                if (dN2 < 0.0d) {
                    return new i(Double.valueOf(-1.0d));
                }
                for (int iMin = (int) Math.min(fVar.n(), dN2); iMin >= 0; iMin--) {
                    if (fVar.y(iMin) && s5.l(fVar.o(iMin), qVarB7)) {
                        return new i(Double.valueOf(iMin));
                    }
                }
                return new i(Double.valueOf(-1.0d));
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                s5.h("map", 1, list);
                q qVarB9 = r4Var.b((q) list.get(0));
                if (qVarB9 instanceof p) {
                    return fVar.n() == 0 ? new f() : b(fVar, r4Var, (p) qVarB9, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                s5.h("pop", 0, list);
                int iN2 = fVar.n();
                if (iN2 == 0) {
                    return q.f19193b;
                }
                int i10 = iN2 - 1;
                q qVarO = fVar.o(i10);
                fVar.v(i10);
                return qVarO;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        fVar.x(fVar.n(), r4Var.b((q) it2.next()));
                    }
                }
                return new i(Double.valueOf(fVar.n()));
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                return c(fVar, r4Var, list, true);
            case 11:
                return c(fVar, r4Var, list, false);
            case '\f':
                s5.h("reverse", 0, list);
                int iN3 = fVar.n();
                if (iN3 != 0) {
                    for (int i11 = 0; i11 < iN3 / 2; i11++) {
                        if (fVar.y(i11)) {
                            q qVarO2 = fVar.o(i11);
                            fVar.x(i11, null);
                            int i12 = (iN3 - 1) - i11;
                            if (fVar.y(i12)) {
                                fVar.x(i11, fVar.o(i12));
                            }
                            fVar.x(i12, qVarO2);
                        }
                    }
                }
                return fVar;
            case '\r':
                s5.h("shift", 0, list);
                if (fVar.n() == 0) {
                    return q.f19193b;
                }
                q qVarO3 = fVar.o(0);
                fVar.v(0);
                return qVarO3;
            case 14:
                s5.j("slice", 2, list);
                if (list.isEmpty()) {
                    return fVar.f();
                }
                double dN3 = fVar.n();
                double dA2 = s5.a(r4Var.b((q) list.get(0)).g().doubleValue());
                double dMax = dA2 < 0.0d ? Math.max(dA2 + dN3, 0.0d) : Math.min(dA2, dN3);
                if (list.size() == 2) {
                    double dA3 = s5.a(r4Var.b((q) list.get(1)).g().doubleValue());
                    dN3 = dA3 < 0.0d ? Math.max(dN3 + dA3, 0.0d) : Math.min(dN3, dA3);
                }
                f fVar5 = new f();
                for (int i13 = (int) dMax; i13 < dN3; i13++) {
                    fVar5.x(fVar5.n(), fVar.o(i13));
                }
                return fVar5;
            case 15:
                s5.h("some", 1, list);
                q qVarB10 = r4Var.b((q) list.get(0));
                if (!(qVarB10 instanceof j)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (fVar.n() != 0) {
                    j jVar2 = (j) qVarB10;
                    Iterator itQ4 = fVar.q();
                    while (itQ4.hasNext()) {
                        int iIntValue2 = ((Integer) itQ4.next()).intValue();
                        if (fVar.y(iIntValue2) && jVar2.a(r4Var, Arrays.asList(fVar.o(iIntValue2), new i(Double.valueOf(iIntValue2)), fVar)).h().booleanValue()) {
                            return q.f19198g;
                        }
                    }
                }
                return q.f19199h;
            case 16:
                s5.j("sort", 1, list);
                if (fVar.n() >= 2) {
                    List listS = fVar.s();
                    if (list.isEmpty()) {
                        jVar = null;
                    } else {
                        q qVarB11 = r4Var.b((q) list.get(0));
                        if (!(qVarB11 instanceof j)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        jVar = (j) qVarB11;
                    }
                    Collections.sort(listS, new c0(jVar, r4Var));
                    fVar.t();
                    Iterator it3 = listS.iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        fVar.x(i14, (q) it3.next());
                        i14++;
                    }
                }
                return fVar;
            case 17:
                if (list.isEmpty()) {
                    return new f();
                }
                int iA = (int) s5.a(r4Var.b((q) list.get(0)).g().doubleValue());
                if (iA < 0) {
                    iA = Math.max(0, iA + fVar.n());
                } else if (iA > fVar.n()) {
                    iA = fVar.n();
                }
                int iN4 = fVar.n();
                f fVar6 = new f();
                if (list.size() > 1) {
                    int iMax = Math.max(0, (int) s5.a(r4Var.b((q) list.get(1)).g().doubleValue()));
                    if (iMax > 0) {
                        for (int i15 = iA; i15 < Math.min(iN4, iA + iMax); i15++) {
                            fVar6.x(fVar6.n(), fVar.o(iA));
                            fVar.v(iA);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i16 = 2; i16 < list.size(); i16++) {
                            q qVarB12 = r4Var.b((q) list.get(i16));
                            if (qVarB12 instanceof h) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            fVar.u((iA + i16) - 2, qVarB12);
                        }
                    }
                } else {
                    while (iA < iN4) {
                        fVar6.x(fVar6.n(), fVar.o(iA));
                        fVar.x(iA, null);
                        iA++;
                    }
                }
                return fVar6;
            case 18:
                s5.h(str2, 0, list);
                return new u(fVar.p(","));
            case 19:
                if (!list.isEmpty()) {
                    f fVar7 = new f();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        q qVarB13 = r4Var.b((q) it4.next());
                        if (qVarB13 instanceof h) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        fVar7.x(fVar7.n(), qVarB13);
                    }
                    int iN5 = fVar7.n();
                    Iterator itQ5 = fVar.q();
                    while (itQ5.hasNext()) {
                        Integer num2 = (Integer) itQ5.next();
                        fVar7.x(num2.intValue() + iN5, fVar.o(num2.intValue()));
                    }
                    fVar.t();
                    Iterator itQ6 = fVar7.q();
                    while (itQ6.hasNext()) {
                        Integer num3 = (Integer) itQ6.next();
                        fVar.x(num3.intValue(), fVar7.o(num3.intValue()));
                    }
                }
                return new i(Double.valueOf(fVar.n()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static f b(f fVar, r4 r4Var, j jVar, Boolean bool, Boolean bool2) {
        f fVar2 = new f();
        Iterator itQ = fVar.q();
        while (itQ.hasNext()) {
            int iIntValue = ((Integer) itQ.next()).intValue();
            if (fVar.y(iIntValue)) {
                q qVarA = jVar.a(r4Var, Arrays.asList(fVar.o(iIntValue), new i(Double.valueOf(iIntValue)), fVar));
                if (qVarA.h().equals(bool)) {
                    return fVar2;
                }
                if (bool2 == null || qVarA.h().equals(bool2)) {
                    fVar2.x(iIntValue, qVarA);
                }
            }
        }
        return fVar2;
    }

    private static q c(f fVar, r4 r4Var, List list, boolean z10) {
        q qVarA;
        s5.i("reduce", 1, list);
        s5.j("reduce", 2, list);
        q qVarB = r4Var.b((q) list.get(0));
        if (!(qVarB instanceof j)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            qVarA = r4Var.b((q) list.get(1));
            if (qVarA instanceof h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (fVar.n() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            qVarA = null;
        }
        j jVar = (j) qVarB;
        int iN = fVar.n();
        int i10 = z10 ? 0 : iN - 1;
        int i11 = z10 ? iN - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (qVarA == null) {
            qVarA = fVar.o(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (fVar.y(i10)) {
                qVarA = jVar.a(r4Var, Arrays.asList(qVarA, fVar.o(i10), new i(Double.valueOf(i10)), fVar));
                if (qVarA instanceof h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return qVarA;
    }
}
