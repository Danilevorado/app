package com.onesignal;

import org.json.JSONObject;

/* loaded from: classes.dex */
class z2 {

    /* renamed from: a, reason: collision with root package name */
    String f22541a;

    /* renamed from: b, reason: collision with root package name */
    public a f22542b;

    /* renamed from: c, reason: collision with root package name */
    public String f22543c;

    /* renamed from: d, reason: collision with root package name */
    public b f22544d;

    /* renamed from: e, reason: collision with root package name */
    public Object f22545e;

    public enum a {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        CUSTOM("custom"),
        UNKNOWN("unknown");


        /* renamed from: m, reason: collision with root package name */
        private String f22551m;

        a(String str) {
            this.f22551m = str;
        }

        public static a b(String str) {
            for (a aVar : values()) {
                if (aVar.f22551m.equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            return UNKNOWN;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f22551m;
        }
    }

    public enum b {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS("in");


        /* renamed from: m, reason: collision with root package name */
        private String f22562m;

        b(String str) {
            this.f22562m = str;
        }

        public static b d(String str) {
            for (b bVar : values()) {
                if (bVar.f22562m.equalsIgnoreCase(str)) {
                    return bVar;
                }
            }
            return EQUAL_TO;
        }

        public boolean b() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f22562m;
        }
    }

    z2(JSONObject jSONObject) {
        this.f22541a = jSONObject.getString("id");
        this.f22542b = a.b(jSONObject.getString("kind"));
        this.f22543c = jSONObject.optString("property", null);
        this.f22544d = b.d(jSONObject.getString("operator"));
        this.f22545e = jSONObject.opt("value");
    }

    public String toString() {
        return "OSTrigger{triggerId='" + this.f22541a + "', kind=" + this.f22542b + ", property='" + this.f22543c + "', operatorType=" + this.f22544d + ", value=" + this.f22545e + '}';
    }
}
