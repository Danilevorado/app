package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import r2.g;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: c, reason: collision with root package name */
    static final String f5502c;

    /* renamed from: d, reason: collision with root package name */
    static final String f5503d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f5504e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f5505f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f5506g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f5507h;

    /* renamed from: a, reason: collision with root package name */
    private final String f5508a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5509b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f5502c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f5503d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f5504e = strA3;
        f5505f = Collections.unmodifiableSet(new HashSet(Arrays.asList(p2.b.b("proto"), p2.b.b("json"))));
        f5506g = new a(strA, null);
        f5507h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f5508a = str;
        this.f5509b = str2;
    }

    public static a d(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // r2.g
    public Set a() {
        return f5505f;
    }

    @Override // r2.f
    public String b() {
        return "cct";
    }

    public byte[] c() {
        String str = this.f5509b;
        if (str == null && this.f5508a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f5508a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String e() {
        return this.f5509b;
    }

    public String f() {
        return this.f5508a;
    }

    @Override // r2.f
    public byte[] getExtras() {
        return c();
    }
}
