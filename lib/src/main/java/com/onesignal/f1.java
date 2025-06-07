package com.onesignal;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class f1 extends a1 {

    /* renamed from: b, reason: collision with root package name */
    public HashMap f21995b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f21996c;

    /* renamed from: d, reason: collision with root package name */
    private Set f21997d;

    /* renamed from: e, reason: collision with root package name */
    private n1 f21998e;

    /* renamed from: f, reason: collision with root package name */
    private double f21999f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22000g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22001h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f22002i;

    /* renamed from: j, reason: collision with root package name */
    private Date f22003j;

    /* renamed from: k, reason: collision with root package name */
    boolean f22004k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22005l;

    f1(String str, Set set, boolean z10, n1 n1Var) {
        super(str);
        new n1();
        this.f22001h = false;
        this.f21997d = set;
        this.f22000g = z10;
        this.f21998e = n1Var;
    }

    f1(JSONObject jSONObject) {
        super(jSONObject.getString("id"));
        this.f21998e = new n1();
        this.f22000g = false;
        this.f22001h = false;
        this.f21995b = l(jSONObject.getJSONObject("variants"));
        this.f21996c = k(jSONObject.getJSONArray("triggers"));
        this.f21997d = new HashSet();
        this.f22003j = j(jSONObject);
        if (jSONObject.has("has_liquid")) {
            this.f22005l = jSONObject.getBoolean("has_liquid");
        }
        if (jSONObject.has("redisplay")) {
            this.f21998e = new n1(jSONObject.getJSONObject("redisplay"));
        }
    }

    f1(boolean z10) {
        super("");
        this.f21998e = new n1();
        this.f22000g = false;
        this.f22001h = false;
        this.f22004k = z10;
    }

    private Date j(JSONObject jSONObject) throws JSONException {
        try {
            String string = jSONObject.getString("end_time");
            if (string.equals("null")) {
                return null;
            }
            try {
                return r3.a().parse(string);
            } catch (ParseException e5) {
                e5.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
        }
    }

    private HashMap l(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            HashMap map2 = new HashMap();
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                map2.put(next2, jSONObject2.getString(next2));
            }
            map.put(next, map2);
        }
        return map;
    }

    void a(String str) {
        this.f21997d.add(str);
    }

    void b() {
        this.f21997d.clear();
    }

    Set c() {
        return this.f21997d;
    }

    boolean d() {
        return this.f22005l;
    }

    n1 e() {
        return this.f21998e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f21691a.equals(((f1) obj).f21691a);
    }

    boolean f(String str) {
        return !this.f21997d.contains(str);
    }

    public boolean g() {
        return this.f22000g;
    }

    public boolean h() {
        if (this.f22003j == null) {
            return false;
        }
        return this.f22003j.before(new Date());
    }

    public int hashCode() {
        return this.f21691a.hashCode();
    }

    boolean i() {
        return this.f22001h;
    }

    protected ArrayList k(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(new z2(jSONArray2.getJSONObject(i11)));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    void m(String str) {
        this.f21997d.remove(str);
    }

    void n(double d10) {
        this.f21999f = d10;
    }

    public void o(boolean z10) {
        this.f22000g = z10;
    }

    void p(boolean z10) {
        this.f22001h = z10;
    }

    boolean q() {
        if (this.f22002i) {
            return false;
        }
        this.f22002i = true;
        return true;
    }

    public String toString() {
        return "OSInAppMessage{messageId='" + this.f21691a + "', variants=" + this.f21995b + ", triggers=" + this.f21996c + ", clickedClickIds=" + this.f21997d + ", redisplayStats=" + this.f21998e + ", displayDuration=" + this.f21999f + ", displayedInSession=" + this.f22000g + ", triggerChanged=" + this.f22001h + ", actionTaken=" + this.f22002i + ", isPreview=" + this.f22004k + ", endTime=" + this.f22003j + ", hasLiquid=" + this.f22005l + '}';
    }
}
