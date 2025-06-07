package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e4.p;
import f4.c;
import i4.e;
import i4.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends f4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: z, reason: collision with root package name */
    public static final e f5555z = h.d();

    /* renamed from: m, reason: collision with root package name */
    final int f5556m;

    /* renamed from: n, reason: collision with root package name */
    private final String f5557n;

    /* renamed from: o, reason: collision with root package name */
    private final String f5558o;

    /* renamed from: p, reason: collision with root package name */
    private final String f5559p;

    /* renamed from: q, reason: collision with root package name */
    private final String f5560q;

    /* renamed from: r, reason: collision with root package name */
    private final Uri f5561r;

    /* renamed from: s, reason: collision with root package name */
    private String f5562s;

    /* renamed from: t, reason: collision with root package name */
    private final long f5563t;

    /* renamed from: u, reason: collision with root package name */
    private final String f5564u;

    /* renamed from: v, reason: collision with root package name */
    final List f5565v;

    /* renamed from: w, reason: collision with root package name */
    private final String f5566w;

    /* renamed from: x, reason: collision with root package name */
    private final String f5567x;

    /* renamed from: y, reason: collision with root package name */
    private final Set f5568y = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f5556m = i10;
        this.f5557n = str;
        this.f5558o = str2;
        this.f5559p = str3;
        this.f5560q = str4;
        this.f5561r = uri;
        this.f5562s = str5;
        this.f5563t = j10;
        this.f5564u = str6;
        this.f5565v = list;
        this.f5566w = str7;
        this.f5567x = str8;
    }

    public static GoogleSignInAccount E(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), p.f(str7), new ArrayList((Collection) p.l(set)), str5, str6);
    }

    public static GoogleSignInAccount F(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount googleSignInAccountE = E(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountE.f5562s = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountE;
    }

    public Uri A() {
        return this.f5561r;
    }

    public Set B() {
        HashSet hashSet = new HashSet(this.f5565v);
        hashSet.addAll(this.f5568y);
        return hashSet;
    }

    public String D() {
        return this.f5562s;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f5564u.equals(this.f5564u) && googleSignInAccount.B().equals(B());
    }

    public String f() {
        return this.f5560q;
    }

    public String h() {
        return this.f5559p;
    }

    public int hashCode() {
        return ((this.f5564u.hashCode() + 527) * 31) + B().hashCode();
    }

    public String v() {
        return this.f5567x;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.k(parcel, 1, this.f5556m);
        c.q(parcel, 2, y(), false);
        c.q(parcel, 3, z(), false);
        c.q(parcel, 4, h(), false);
        c.q(parcel, 5, f(), false);
        c.p(parcel, 6, A(), i10, false);
        c.q(parcel, 7, D(), false);
        c.n(parcel, 8, this.f5563t);
        c.q(parcel, 9, this.f5564u, false);
        c.u(parcel, 10, this.f5565v, false);
        c.q(parcel, 11, x(), false);
        c.q(parcel, 12, v(), false);
        c.b(parcel, iA);
    }

    public String x() {
        return this.f5566w;
    }

    public String y() {
        return this.f5557n;
    }

    public String z() {
        return this.f5558o;
    }
}
