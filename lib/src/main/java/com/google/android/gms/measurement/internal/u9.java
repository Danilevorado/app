package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class u9 extends q5 {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f20454g = {"firebase_", "google_", "ga_"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f20455h = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    private SecureRandom f20456c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f20457d;

    /* renamed from: e, reason: collision with root package name */
    private int f20458e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f20459f;

    u9(w4 w4Var) {
        super(w4Var);
        this.f20459f = null;
        this.f20457d = new AtomicLong(0L);
    }

    static boolean W(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean X(String str) {
        e4.p.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    static boolean Y(Context context) {
        ActivityInfo receiverInfo;
        e4.p.l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean Z(Context context, boolean z10) {
        e4.p.l(context);
        return i0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean a0(String str) {
        return !f20455h[0].equals(str);
    }

    static final boolean d0(Bundle bundle, int i10) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    static final boolean e0(String str) {
        e4.p.l(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int f0(String str) {
        if ("_ldl".equals(str)) {
            this.f20269a.y();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f20269a.y();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f20269a.y();
            return 100;
        }
        this.f20269a.y();
        return 36;
    }

    private final Object g0(int i10, Object obj, boolean z10, boolean z11) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return p(obj.toString(), i10, z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleU0 = u0((Bundle) parcelable);
                if (!bundleU0.isEmpty()) {
                    arrayList.add(bundleU0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private static boolean h0(String str, String[] strArr) {
        e4.p.l(strArr);
        for (String str2 : strArr) {
            if (x4.c0.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean i0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static long q0(byte[] bArr) {
        e4.p.l(bArr);
        int length = bArr.length;
        int i10 = 0;
        e4.p.o(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    static MessageDigest r() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList t(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", dVar.f19838m);
            bundle.putString("origin", dVar.f19839n);
            bundle.putLong("creation_timestamp", dVar.f19841p);
            bundle.putString("name", dVar.f19840o.f20314n);
            x4.p.b(bundle, e4.p.l(dVar.f19840o.f()));
            bundle.putBoolean("active", dVar.f19842q);
            String str = dVar.f19843r;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            v vVar = dVar.f19844s;
            if (vVar != null) {
                bundle.putString("timed_out_event_name", vVar.f20460m);
                t tVar = vVar.f20461n;
                if (tVar != null) {
                    bundle.putBundle("timed_out_event_params", tVar.v());
                }
            }
            bundle.putLong("trigger_timeout", dVar.f19845t);
            v vVar2 = dVar.f19846u;
            if (vVar2 != null) {
                bundle.putString("triggered_event_name", vVar2.f20460m);
                t tVar2 = vVar2.f20461n;
                if (tVar2 != null) {
                    bundle.putBundle("triggered_event_params", tVar2.v());
                }
            }
            bundle.putLong("triggered_timestamp", dVar.f19840o.f20315o);
            bundle.putLong("time_to_live", dVar.f19847v);
            v vVar3 = dVar.f19848w;
            if (vVar3 != null) {
                bundle.putString("expired_event_name", vVar3.f20460m);
                t tVar3 = vVar3.f20461n;
                if (tVar3 != null) {
                    bundle.putBundle("expired_event_params", tVar3.v());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void w(a7 a7Var, Bundle bundle, boolean z10) {
        if (bundle != null && a7Var != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = a7Var.f19755a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = a7Var.f19756b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", a7Var.f19757c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && a7Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    final void A(t9 t9Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        d0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        t9Var.a(str, "_err", bundle);
    }

    final void C(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.f20269a.b().v().c("Not putting event parameter. Invalid value type. name, type", this.f20269a.D().e(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void D(com.google.android.gms.internal.measurement.i1 i1Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            i1Var.h0(bundle);
        } catch (RemoteException e5) {
            this.f20269a.b().u().b("Error returning boolean value to wrapper", e5);
        }
    }

    public final void E(com.google.android.gms.internal.measurement.i1 i1Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            i1Var.h0(bundle);
        } catch (RemoteException e5) {
            this.f20269a.b().u().b("Error returning bundle list to wrapper", e5);
        }
    }

    public final void F(com.google.android.gms.internal.measurement.i1 i1Var, Bundle bundle) {
        try {
            i1Var.h0(bundle);
        } catch (RemoteException e5) {
            this.f20269a.b().u().b("Error returning bundle value to wrapper", e5);
        }
    }

    public final void G(com.google.android.gms.internal.measurement.i1 i1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            i1Var.h0(bundle);
        } catch (RemoteException e5) {
            this.f20269a.b().u().b("Error returning byte array to wrapper", e5);
        }
    }

    public final void H(com.google.android.gms.internal.measurement.i1 i1Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            i1Var.h0(bundle);
        } catch (RemoteException e5) {
            this.f20269a.b().u().b("Error returning int value to wrapper", e5);
        }
    }

    public final void I(com.google.android.gms.internal.measurement.i1 i1Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            i1Var.h0(bundle);
        } catch (RemoteException e5) {
            this.f20269a.b().u().b("Error returning long value to wrapper", e5);
        }
    }

    public final void J(com.google.android.gms.internal.measurement.i1 i1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            i1Var.h0(bundle);
        } catch (RemoteException e5) {
            this.f20269a.b().u().b("Error returning string value to wrapper", e5);
        }
    }

    final void K(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int i10;
        String str4;
        int iO;
        if (bundle == null) {
            return;
        }
        this.f20269a.y();
        int i11 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                int iM0 = !z10 ? m0(str5) : 0;
                if (iM0 == 0) {
                    iM0 = l0(str5);
                }
                i10 = iM0;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                v(bundle, i10, str5, str5, i10 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (U(bundle.get(str5))) {
                    this.f20269a.b().v().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iO = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    iO = O(str, str2, str5, bundle.get(str5), bundle, list, z10, false);
                }
                if (iO != 0 && !"_ev".equals(str4)) {
                    v(bundle, iO, str4, str4, bundle.get(str4));
                } else if (X(str4) && !h0(str4, x4.r.f28273d) && (i11 = i11 + 1) > 0) {
                    this.f20269a.b().q().c("Item cannot contain custom parameters", this.f20269a.D().d(str2), this.f20269a.D().b(bundle));
                    d0(bundle, 23);
                }
                bundle.remove(str4);
            }
        }
    }

    final boolean L(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (e0(str)) {
                return true;
            }
            if (this.f20269a.o()) {
                this.f20269a.b().q().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", s3.y(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f20269a.o()) {
                this.f20269a.b().q().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (e0(str2)) {
            return true;
        }
        this.f20269a.b().q().b("Invalid admob_app_id. Analytics disabled.", s3.y(str2));
        return false;
    }

    final boolean M(String str, int i10, String str2) {
        if (str2 == null) {
            this.f20269a.b().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        this.f20269a.b().q().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    final boolean N(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f20269a.b().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        e4.p.l(str2);
        String[] strArr3 = f20454g;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f20269a.b().q().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !h0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && h0(str2, strArr2)) {
            return true;
        }
        this.f20269a.b().q().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int O(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u9.O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    final boolean P(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i10) {
                this.f20269a.b().v().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    final boolean Q(String str, String str2) {
        if (str2 == null) {
            this.f20269a.b().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f20269a.b().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.f20269a.b().q().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f20269a.b().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean R(String str, String str2) {
        if (str2 == null) {
            this.f20269a.b().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f20269a.b().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.f20269a.b().q().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f20269a.b().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean S(String str) {
        f();
        if (k4.c.a(this.f20269a.a()).a(str) == 0) {
            return true;
        }
        this.f20269a.b().o().b("Permission not granted", str);
        return false;
    }

    final boolean T(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strS = this.f20269a.y().s();
        this.f20269a.x();
        return strS.equals(str);
    }

    final boolean U(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    final boolean V(Context context, String str) {
        q3 q3VarP;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoF = k4.c.a(context).f(str, 64);
            if (packageInfoF == null || (signatureArr = packageInfoF.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e5) {
            e = e5;
            q3VarP = this.f20269a.b().p();
            str2 = "Package name not found";
            q3VarP.b(str2, e);
            return true;
        } catch (CertificateException e10) {
            e = e10;
            q3VarP = this.f20269a.b().p();
            str2 = "Error obtaining certificate";
            q3VarP.b(str2, e);
            return true;
        }
    }

    final boolean b0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            e4.p.l(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    final byte[] c0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.q5
    protected final void g() {
        f();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                this.f20269a.b().u().a("Utils falling back to Random for random id");
            }
        }
        this.f20457d.set(jNextLong);
    }

    @Override // com.google.android.gms.measurement.internal.q5
    protected final boolean h() {
        return true;
    }

    final int j0(String str, Object obj) {
        int iF0;
        String str2;
        if ("_ldl".equals(str)) {
            iF0 = f0(str);
            str2 = "user property referrer";
        } else {
            iF0 = f0(str);
            str2 = "user property";
        }
        return P(str2, str, iF0, obj) ? 0 : 7;
    }

    final int k0(String str) {
        if (!Q("event", str)) {
            return 2;
        }
        if (!N("event", x4.q.f28266a, x4.q.f28267b, str)) {
            return 13;
        }
        this.f20269a.y();
        return !M("event", 40, str) ? 2 : 0;
    }

    final int l0(String str) {
        if (!Q("event param", str)) {
            return 3;
        }
        if (!N("event param", null, null, str)) {
            return 14;
        }
        this.f20269a.y();
        return !M("event param", 40, str) ? 3 : 0;
    }

    final Object m(String str, Object obj) {
        int i10 = 256;
        if ("_ev".equals(str)) {
            this.f20269a.y();
            return g0(256, obj, true, true);
        }
        if (W(str)) {
            this.f20269a.y();
        } else {
            this.f20269a.y();
            i10 = 100;
        }
        return g0(i10, obj, false, true);
    }

    final int m0(String str) {
        if (!R("event param", str)) {
            return 3;
        }
        if (!N("event param", null, null, str)) {
            return 14;
        }
        this.f20269a.y();
        return !M("event param", 40, str) ? 3 : 0;
    }

    final Object n(String str, Object obj) {
        boolean zEquals = "_ldl".equals(str);
        int iF0 = f0(str);
        return zEquals ? g0(iF0, obj, true, false) : g0(iF0, obj, false, false);
    }

    final int n0(String str) {
        if (!Q("user property", str)) {
            return 6;
        }
        if (!N("user property", x4.s.f28274a, null, str)) {
            return 15;
        }
        this.f20269a.y();
        return !M("user property", 24, str) ? 6 : 0;
    }

    final String o() {
        byte[] bArr = new byte[16];
        s().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final int o0() {
        if (this.f20459f == null) {
            this.f20459f = Integer.valueOf(b4.f.h().b(this.f20269a.a()) / AdError.NETWORK_ERROR_CODE);
        }
        return this.f20459f.intValue();
    }

    public final String p(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    public final int p0(int i10) {
        return b4.f.h().j(this.f20269a.a(), 12451000);
    }

    public final URL q(long j10, String str, String str2, long j11) {
        try {
            e4.p.f(str2);
            e4.p.f(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 68000L, Integer.valueOf(o0())), str2, str, Long.valueOf(j11));
            if (str.equals(this.f20269a.y().t())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e5) {
            this.f20269a.b().p().b("Failed to create BOW URL for Deferred Deep Link. exception", e5.getMessage());
            return null;
        }
    }

    public final long r0() {
        long andIncrement;
        long j10;
        if (this.f20457d.get() != 0) {
            synchronized (this.f20457d) {
                this.f20457d.compareAndSet(-1L, 1L);
                andIncrement = this.f20457d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f20457d) {
            long jNextLong = new Random(System.nanoTime() ^ this.f20269a.d().a()).nextLong();
            int i10 = this.f20458e + 1;
            this.f20458e = i10;
            j10 = jNextLong + i10;
        }
        return j10;
    }

    final SecureRandom s() {
        f();
        if (this.f20456c == null) {
            this.f20456c = new SecureRandom();
        }
        return this.f20456c;
    }

    public final long s0(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    final Bundle t0(Uri uri, boolean z10, boolean z11) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    if (z10) {
                        queryParameter5 = uri.getQueryParameter("utm_id");
                        queryParameter6 = uri.getQueryParameter("dclid");
                    } else {
                        queryParameter5 = null;
                        queryParameter6 = null;
                    }
                    queryParameter7 = z11 ? uri.getQueryParameter("srsltid") : null;
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && ((!z10 || (TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6))) && (!z11 || TextUtils.isEmpty(queryParameter7)))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                String queryParameter8 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("term", queryParameter8);
                }
                String queryParameter9 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("content", queryParameter9);
                }
                String queryParameter10 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter10)) {
                    bundle.putString("aclid", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter11)) {
                    bundle.putString("cp1", queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter12)) {
                    bundle.putString("anid", queryParameter12);
                }
                if (z10) {
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("campaign_id", queryParameter5);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("dclid", queryParameter6);
                    }
                    String queryParameter13 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("source_platform", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("creative_format", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("marketing_tactic", queryParameter15);
                    }
                }
                if (z11 && !TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("srsltid", queryParameter7);
                }
                return bundle;
            } catch (UnsupportedOperationException e5) {
                this.f20269a.b().u().b("Install referrer url isn't a hierarchical URI", e5);
            }
        }
        return null;
    }

    final void u(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f20269a.b().u().b("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    final Bundle u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objM = m(str, bundle.get(str));
                if (objM == null) {
                    this.f20269a.b().v().b("Param value can't be null", this.f20269a.D().e(str));
                } else {
                    C(bundle2, str, objM);
                }
            }
        }
        return bundle2;
    }

    final void v(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (d0(bundle, i10)) {
            this.f20269a.y();
            bundle.putString("_ev", p(str, 40, true));
            if (obj != null) {
                e4.p.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.os.Bundle v0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u9.v0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    final v w0(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (k0(str2) != 0) {
            this.f20269a.b().p().b("Invalid conditional property event name", this.f20269a.D().f(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleV0 = v0(str, str2, bundle2, i4.f.a("_o"), true);
        if (z10) {
            bundleV0 = u0(bundleV0);
        }
        e4.p.l(bundleV0);
        return new v(str2, new t(bundleV0), str3, j10);
    }

    final void y(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f20269a.N().C(bundle, str, bundle2.get(str));
            }
        }
    }

    final void z(t3 t3Var, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(t3Var.f20413d.keySet())) {
            if (X(str) && (i11 = i11 + 1) > i10) {
                this.f20269a.b().q().c("Event can't contain more than " + i10 + " params", this.f20269a.D().d(t3Var.f20410a), this.f20269a.D().b(t3Var.f20413d));
                d0(t3Var.f20413d, 5);
                t3Var.f20413d.remove(str);
            }
        }
    }
}
