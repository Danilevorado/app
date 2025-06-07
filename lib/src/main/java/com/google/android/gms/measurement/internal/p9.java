package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ld;
import com.google.android.gms.internal.measurement.yc;
import f4.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class p9 extends c9 {
    p9(n9 n9Var) {
        super(n9Var);
    }

    static com.google.android.gms.internal.measurement.x9 C(com.google.android.gms.internal.measurement.x9 x9Var, byte[] bArr) {
        com.google.android.gms.internal.measurement.j8 j8VarB = com.google.android.gms.internal.measurement.j8.b();
        return j8VarB != null ? x9Var.l(bArr, j8VarB) : x9Var.o(bArr);
    }

    static List H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    static boolean L(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    static boolean N(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static final void P(com.google.android.gms.internal.measurement.i4 i4Var, String str, Object obj) {
        List listH = i4Var.H();
        int i10 = 0;
        while (true) {
            if (i10 >= listH.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.n4) listH.get(i10)).B())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.m4 m4VarZ = com.google.android.gms.internal.measurement.n4.z();
        m4VarZ.B(str);
        if (obj instanceof Long) {
            m4VarZ.A(((Long) obj).longValue());
        }
        if (i10 >= 0) {
            i4Var.B(i10, m4VarZ);
        } else {
            i4Var.w(m4VarZ);
        }
    }

    static final boolean k(v vVar, z9 z9Var) {
        e4.p.l(vVar);
        e4.p.l(z9Var);
        return (TextUtils.isEmpty(z9Var.f20613n) && TextUtils.isEmpty(z9Var.C)) ? false : true;
    }

    static final com.google.android.gms.internal.measurement.n4 l(com.google.android.gms.internal.measurement.j4 j4Var, String str) {
        for (com.google.android.gms.internal.measurement.n4 n4Var : j4Var.D()) {
            if (n4Var.B().equals(str)) {
                return n4Var;
            }
        }
        return null;
    }

    static final Object m(com.google.android.gms.internal.measurement.j4 j4Var, String str) {
        com.google.android.gms.internal.measurement.n4 n4VarL = l(j4Var, str);
        if (n4VarL == null) {
            return null;
        }
        if (n4VarL.S()) {
            return n4VarL.C();
        }
        if (n4VarL.Q()) {
            return Long.valueOf(n4VarL.y());
        }
        if (n4VarL.O()) {
            return Double.valueOf(n4VarL.v());
        }
        if (n4VarL.x() <= 0) {
            return null;
        }
        List<com.google.android.gms.internal.measurement.n4> listD = n4VarL.D();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.n4 n4Var : listD) {
            if (n4Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.n4 n4Var2 : n4Var.D()) {
                    if (n4Var2.S()) {
                        bundle.putString(n4Var2.B(), n4Var2.C());
                    } else if (n4Var2.Q()) {
                        bundle.putLong(n4Var2.B(), n4Var2.y());
                    } else if (n4Var2.O()) {
                        bundle.putDouble(n4Var2.B(), n4Var2.v());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void n(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.n4 n4Var = (com.google.android.gms.internal.measurement.n4) it.next();
            if (n4Var != null) {
                p(sb2, i11);
                sb2.append("param {\n");
                s(sb2, i11, "name", n4Var.R() ? this.f20269a.D().e(n4Var.B()) : null);
                s(sb2, i11, "string_value", n4Var.S() ? n4Var.C() : null);
                s(sb2, i11, "int_value", n4Var.Q() ? Long.valueOf(n4Var.y()) : null);
                s(sb2, i11, "double_value", n4Var.O() ? Double.valueOf(n4Var.v()) : null);
                if (n4Var.x() > 0) {
                    n(sb2, i11, n4Var.D());
                }
                p(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    private final void o(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.b3 b3Var) {
        String str;
        if (b3Var == null) {
            return;
        }
        p(sb2, i10);
        sb2.append("filter {\n");
        if (b3Var.C()) {
            s(sb2, i10, "complement", Boolean.valueOf(b3Var.B()));
        }
        if (b3Var.E()) {
            s(sb2, i10, "param_name", this.f20269a.D().e(b3Var.z()));
        }
        if (b3Var.F()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.n3 n3VarY = b3Var.y();
            if (n3VarY != null) {
                p(sb2, i11);
                sb2.append("string_filter {\n");
                if (n3VarY.D()) {
                    switch (n3VarY.E()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    s(sb2, i11, "match_type", str);
                }
                if (n3VarY.C()) {
                    s(sb2, i11, "expression", n3VarY.y());
                }
                if (n3VarY.B()) {
                    s(sb2, i11, "case_sensitive", Boolean.valueOf(n3VarY.A()));
                }
                if (n3VarY.v() > 0) {
                    p(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str2 : n3VarY.z()) {
                        p(sb2, i11 + 2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                p(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (b3Var.D()) {
            t(sb2, i10 + 1, "number_filter", b3Var.x());
        }
        p(sb2, i10);
        sb2.append("}\n");
    }

    private static final void p(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private static final String q(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final void r(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.z4 z4Var) {
        if (z4Var == null) {
            return;
        }
        p(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (z4Var.w() != 0) {
            p(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : z4Var.F()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (z4Var.y() != 0) {
            p(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : z4Var.H()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (z4Var.v() != 0) {
            p(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.h4 h4Var : z4Var.E()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(h4Var.C() ? Integer.valueOf(h4Var.v()) : null);
                sb2.append(":");
                sb2.append(h4Var.B() ? Long.valueOf(h4Var.w()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (z4Var.x() != 0) {
            p(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.b5 b5Var : z4Var.G()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(b5Var.D() ? Integer.valueOf(b5Var.w()) : null);
                sb2.append(": [");
                Iterator it = b5Var.A().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        p(sb2, 3);
        sb2.append("}\n");
    }

    private static final void s(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        p(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void t(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.g3 g3Var) {
        if (g3Var == null) {
            return;
        }
        p(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (g3Var.B()) {
            int iG = g3Var.G();
            s(sb2, i10, "comparison_type", iG != 1 ? iG != 2 ? iG != 3 ? iG != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (g3Var.D()) {
            s(sb2, i10, "match_as_float", Boolean.valueOf(g3Var.A()));
        }
        if (g3Var.C()) {
            s(sb2, i10, "comparison_value", g3Var.x());
        }
        if (g3Var.F()) {
            s(sb2, i10, "min_comparison_value", g3Var.z());
        }
        if (g3Var.E()) {
            s(sb2, i10, "max_comparison_value", g3Var.y());
        }
        p(sb2, i10);
        sb2.append("}\n");
    }

    static int u(com.google.android.gms.internal.measurement.t4 t4Var, String str) {
        if (t4Var != null) {
            for (int i10 = 0; i10 < t4Var.n0(); i10++) {
                if (str.equals(t4Var.h0(i10).A())) {
                    return i10;
                }
            }
        }
        return -1;
    }

    final com.google.android.gms.internal.measurement.j4 A(q qVar) {
        com.google.android.gms.internal.measurement.i4 i4VarZ = com.google.android.gms.internal.measurement.j4.z();
        i4VarZ.D(qVar.f20280e);
        s sVar = new s(qVar.f20281f);
        while (sVar.hasNext()) {
            String next = sVar.next();
            com.google.android.gms.internal.measurement.m4 m4VarZ = com.google.android.gms.internal.measurement.n4.z();
            m4VarZ.B(next);
            Object objZ = qVar.f20281f.z(next);
            e4.p.l(objZ);
            J(m4VarZ, objZ);
            i4VarZ.w(m4VarZ);
        }
        return (com.google.android.gms.internal.measurement.j4) i4VarZ.k();
    }

    final String D(com.google.android.gms.internal.measurement.s4 s4Var) {
        if (s4Var == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.u4 u4Var : s4Var.y()) {
            if (u4Var != null) {
                p(sb2, 1);
                sb2.append("bundle {\n");
                if (u4Var.m1()) {
                    s(sb2, 1, "protocol_version", Integer.valueOf(u4Var.v1()));
                }
                ld.c();
                if (this.f20269a.y().A(null, i3.A0) && u4Var.p1()) {
                    s(sb2, 1, "session_stitching_token", u4Var.F());
                }
                s(sb2, 1, "platform", u4Var.D());
                if (u4Var.i1()) {
                    s(sb2, 1, "gmp_version", Long.valueOf(u4Var.D1()));
                }
                if (u4Var.t1()) {
                    s(sb2, 1, "uploading_gmp_version", Long.valueOf(u4Var.I1()));
                }
                if (u4Var.g1()) {
                    s(sb2, 1, "dynamite_version", Long.valueOf(u4Var.B1()));
                }
                if (u4Var.d1()) {
                    s(sb2, 1, "config_version", Long.valueOf(u4Var.z1()));
                }
                s(sb2, 1, "gmp_app_id", u4Var.A());
                s(sb2, 1, "admob_app_id", u4Var.N1());
                s(sb2, 1, "app_id", u4Var.O1());
                s(sb2, 1, "app_version", u4Var.v());
                if (u4Var.u0()) {
                    s(sb2, 1, "app_version_major", Integer.valueOf(u4Var.V()));
                }
                s(sb2, 1, "firebase_instance_id", u4Var.z());
                if (u4Var.f1()) {
                    s(sb2, 1, "dev_cert_hash", Long.valueOf(u4Var.A1()));
                }
                s(sb2, 1, "app_store", u4Var.Q1());
                if (u4Var.s1()) {
                    s(sb2, 1, "upload_timestamp_millis", Long.valueOf(u4Var.H1()));
                }
                if (u4Var.q1()) {
                    s(sb2, 1, "start_timestamp_millis", Long.valueOf(u4Var.G1()));
                }
                if (u4Var.h1()) {
                    s(sb2, 1, "end_timestamp_millis", Long.valueOf(u4Var.C1()));
                }
                if (u4Var.l1()) {
                    s(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(u4Var.F1()));
                }
                if (u4Var.k1()) {
                    s(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(u4Var.E1()));
                }
                s(sb2, 1, "app_instance_id", u4Var.P1());
                s(sb2, 1, "resettable_device_id", u4Var.E());
                s(sb2, 1, "ds_id", u4Var.y());
                if (u4Var.j1()) {
                    s(sb2, 1, "limited_ad_tracking", Boolean.valueOf(u4Var.s0()));
                }
                s(sb2, 1, "os_version", u4Var.C());
                s(sb2, 1, "device_model", u4Var.x());
                s(sb2, 1, "user_default_language", u4Var.G());
                if (u4Var.r1()) {
                    s(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(u4Var.x1()));
                }
                if (u4Var.v0()) {
                    s(sb2, 1, "bundle_sequential_index", Integer.valueOf(u4Var.a1()));
                }
                if (u4Var.o1()) {
                    s(sb2, 1, "service_upload", Boolean.valueOf(u4Var.t0()));
                }
                s(sb2, 1, "health_monitor", u4Var.B());
                if (u4Var.n1()) {
                    s(sb2, 1, "retry_counter", Integer.valueOf(u4Var.w1()));
                }
                if (u4Var.e1()) {
                    s(sb2, 1, "consent_signals", u4Var.w());
                }
                List<com.google.android.gms.internal.measurement.d5> listJ = u4Var.J();
                if (listJ != null) {
                    for (com.google.android.gms.internal.measurement.d5 d5Var : listJ) {
                        if (d5Var != null) {
                            p(sb2, 2);
                            sb2.append("user_property {\n");
                            s(sb2, 2, "set_timestamp_millis", d5Var.M() ? Long.valueOf(d5Var.x()) : null);
                            s(sb2, 2, "name", this.f20269a.D().f(d5Var.A()));
                            s(sb2, 2, "string_value", d5Var.B());
                            s(sb2, 2, "int_value", d5Var.L() ? Long.valueOf(d5Var.w()) : null);
                            s(sb2, 2, "double_value", d5Var.K() ? Double.valueOf(d5Var.v()) : null);
                            p(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.f4> listH = u4Var.H();
                if (listH != null) {
                    for (com.google.android.gms.internal.measurement.f4 f4Var : listH) {
                        if (f4Var != null) {
                            p(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (f4Var.F()) {
                                s(sb2, 2, "audience_id", Integer.valueOf(f4Var.v()));
                            }
                            if (f4Var.G()) {
                                s(sb2, 2, "new_audience", Boolean.valueOf(f4Var.E()));
                            }
                            r(sb2, 2, "current_data", f4Var.y());
                            if (f4Var.H()) {
                                r(sb2, 2, "previous_data", f4Var.z());
                            }
                            p(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.j4> listI = u4Var.I();
                if (listI != null) {
                    for (com.google.android.gms.internal.measurement.j4 j4Var : listI) {
                        if (j4Var != null) {
                            p(sb2, 2);
                            sb2.append("event {\n");
                            s(sb2, 2, "name", this.f20269a.D().d(j4Var.C()));
                            if (j4Var.O()) {
                                s(sb2, 2, "timestamp_millis", Long.valueOf(j4Var.y()));
                            }
                            if (j4Var.N()) {
                                s(sb2, 2, "previous_timestamp_millis", Long.valueOf(j4Var.x()));
                            }
                            if (j4Var.M()) {
                                s(sb2, 2, "count", Integer.valueOf(j4Var.v()));
                            }
                            if (j4Var.w() != 0) {
                                n(sb2, 2, j4Var.D());
                            }
                            p(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                p(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    final String E(com.google.android.gms.internal.measurement.z2 z2Var) {
        if (z2Var == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (z2Var.J()) {
            s(sb2, 0, "filter_id", Integer.valueOf(z2Var.w()));
        }
        s(sb2, 0, "event_name", this.f20269a.D().d(z2Var.B()));
        String strQ = q(z2Var.F(), z2Var.G(), z2Var.H());
        if (!strQ.isEmpty()) {
            s(sb2, 0, "filter_type", strQ);
        }
        if (z2Var.I()) {
            t(sb2, 1, "event_count_filter", z2Var.A());
        }
        if (z2Var.v() > 0) {
            sb2.append("  filters {\n");
            Iterator it = z2Var.C().iterator();
            while (it.hasNext()) {
                o(sb2, 2, (com.google.android.gms.internal.measurement.b3) it.next());
            }
        }
        p(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    final String F(com.google.android.gms.internal.measurement.i3 i3Var) {
        if (i3Var == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (i3Var.E()) {
            s(sb2, 0, "filter_id", Integer.valueOf(i3Var.v()));
        }
        s(sb2, 0, "property_name", this.f20269a.D().f(i3Var.z()));
        String strQ = q(i3Var.B(), i3Var.C(), i3Var.D());
        if (!strQ.isEmpty()) {
            s(sb2, 0, "filter_type", strQ);
        }
        o(sb2, 1, i3Var.w());
        sb2.append("}\n");
        return sb2.toString();
    }

    final List G(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f20269a.b().u().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.f20269a.b().u().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.Map I(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            com.google.android.gms.internal.measurement.yc.c()
            com.google.android.gms.measurement.internal.w4 r4 = r10.f20269a
            com.google.android.gms.measurement.internal.h r4 = r4.y()
            r5 = 0
            com.google.android.gms.measurement.internal.h3 r6 = com.google.android.gms.measurement.internal.i3.f20024k0
            boolean r4 = r4.A(r5, r6)
            if (r4 == 0) goto L3c
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L3c:
            boolean r4 = r3 instanceof android.os.Bundle[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L49:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L4f:
            if (r12 == 0) goto Ld
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3 instanceof android.os.Parcelable[]
            r6 = 0
            if (r5 == 0) goto L73
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r5 = r3.length
            r7 = r6
        L5f:
            if (r7 >= r5) goto La1
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.I(r8, r6)
            r4.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5f
        L73:
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 == 0) goto L94
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r5 = r3.size()
            r7 = r6
        L7e:
            if (r7 >= r5) goto La1
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L91
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.I(r8, r6)
            r4.add(r8)
        L91:
            int r7 = r7 + 1
            goto L7e
        L94:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto La1
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.I(r3, r6)
            r4.add(r3)
        La1:
            r0.put(r2, r4)
            goto Ld
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p9.I(android.os.Bundle, boolean):java.util.Map");
    }

    final void J(com.google.android.gms.internal.measurement.m4 m4Var, Object obj) {
        e4.p.l(obj);
        m4Var.y();
        m4Var.w();
        m4Var.v();
        m4Var.x();
        if (obj instanceof String) {
            m4Var.C((String) obj);
            return;
        }
        if (obj instanceof Long) {
            m4Var.A(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            m4Var.z(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f20269a.b().p().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.m4 m4VarZ = com.google.android.gms.internal.measurement.n4.z();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.m4 m4VarZ2 = com.google.android.gms.internal.measurement.n4.z();
                    m4VarZ2.B(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        m4VarZ2.A(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        m4VarZ2.C((String) obj2);
                    } else if (obj2 instanceof Double) {
                        m4VarZ2.z(((Double) obj2).doubleValue());
                    }
                    m4VarZ.u(m4VarZ2);
                }
                if (m4VarZ.s() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.n4) m4VarZ.k());
                }
            }
        }
        m4Var.t(arrayList);
    }

    final void K(com.google.android.gms.internal.measurement.c5 c5Var, Object obj) {
        e4.p.l(obj);
        c5Var.u();
        c5Var.t();
        c5Var.s();
        if (obj instanceof String) {
            c5Var.z((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c5Var.w(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c5Var.v(((Double) obj).doubleValue());
        } else {
            this.f20269a.b().p().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final boolean M(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f20269a.d().a() - j10) > j11;
    }

    final byte[] O(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e5) {
            this.f20269a.b().p().b("Failed to gzip content", e5);
            throw e5;
        }
    }

    @Override // com.google.android.gms.measurement.internal.c9
    protected final boolean j() {
        return false;
    }

    final long v(byte[] bArr) throws NoSuchAlgorithmException {
        e4.p.l(bArr);
        this.f20269a.N().f();
        MessageDigest messageDigestR = u9.r();
        if (messageDigestR != null) {
            return u9.q0(messageDigestR.digest(bArr));
        }
        this.f20269a.b().p().a("Failed to get MD5");
        return 0L;
    }

    final Bundle w(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                yc.c();
                ArrayList arrayList = (ArrayList) obj;
                if (this.f20269a.y().A(null, i3.f20024k0)) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        arrayList2.add(w((Map) arrayList.get(i10), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        arrayList3.add(w((Map) arrayList.get(i11), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList3);
                }
            }
        }
        return bundle;
    }

    final Parcelable y(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (b.a unused) {
            this.f20269a.b().p().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    final v z(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle bundleW = w(bVar.e(), true);
        String string = (!bundleW.containsKey("_o") || (obj = bundleW.get("_o")) == null) ? "app" : obj.toString();
        String strB = x4.q.b(bVar.d());
        if (strB == null) {
            strB = bVar.d();
        }
        return new v(strB, new t(bundleW), string, bVar.a());
    }
}
