package com.onesignal;

import android.content.ContentValues;
import android.database.Cursor;
import com.facebook.ads.AdSDKNotificationListener;
import com.onesignal.e3;
import com.onesignal.p3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class o1 {

    /* renamed from: a, reason: collision with root package name */
    private final l3 f22127a;

    /* renamed from: b, reason: collision with root package name */
    private final r1 f22128b;

    /* renamed from: c, reason: collision with root package name */
    private final n2 f22129c;

    /* renamed from: d, reason: collision with root package name */
    private int f22130d = 0;

    class a extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22131a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f22132b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22133c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f22134d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f22135e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f22136f;

        a(String str, int i10, String str2, String str3, String str4, boolean z10) throws JSONException {
            this.f22131a = str;
            this.f22132b = i10;
            this.f22133c = str2;
            this.f22134d = str3;
            this.f22135e = str4;
            this.f22136f = z10;
            put("app_id", str);
            put("device_type", i10);
            put("player_id", str2);
            put("click_id", str3);
            put("variant_id", str4);
            if (z10) {
                put("first_click", true);
            }
        }
    }

    class b extends p3.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f22138a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f22139b;

        b(Set set, i iVar) {
            this.f22138a = set;
            this.f22139b = iVar;
        }

        @Override // com.onesignal.p3.g
        void a(int i10, String str, Throwable th) {
            o1.this.u("engagement", i10, str);
            this.f22139b.b(str);
        }

        @Override // com.onesignal.p3.g
        void b(String str) {
            o1.this.v("engagement", str);
            o1.this.w(this.f22138a);
        }
    }

    class c extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22141a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22143c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f22144d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f22145e;

        c(String str, String str2, String str3, int i10, String str4) throws JSONException {
            this.f22141a = str;
            this.f22142b = str2;
            this.f22143c = str3;
            this.f22144d = i10;
            this.f22145e = str4;
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", i10);
            put("page_id", str4);
        }
    }

    class d extends p3.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f22147a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f22148b;

        d(Set set, i iVar) {
            this.f22147a = set;
            this.f22148b = iVar;
        }

        @Override // com.onesignal.p3.g
        void a(int i10, String str, Throwable th) {
            o1.this.u("page impression", i10, str);
            this.f22148b.b(str);
        }

        @Override // com.onesignal.p3.g
        void b(String str) {
            o1.this.v("page impression", str);
            o1.this.C(this.f22147a);
        }
    }

    class e extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22150a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22151b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22152c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f22153d;

        e(String str, String str2, String str3, int i10) throws JSONException {
            this.f22150a = str;
            this.f22151b = str2;
            this.f22152c = str3;
            this.f22153d = i10;
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", i10);
            put("first_impression", true);
        }
    }

    class f extends p3.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f22155a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f22156b;

        f(Set set, i iVar) {
            this.f22155a = set;
            this.f22156b = iVar;
        }

        @Override // com.onesignal.p3.g
        void a(int i10, String str, Throwable th) {
            o1.this.u(AdSDKNotificationListener.IMPRESSION_EVENT, i10, str);
            this.f22156b.b(str);
        }

        @Override // com.onesignal.p3.g
        void b(String str) {
            o1.this.v(AdSDKNotificationListener.IMPRESSION_EVENT, str);
            o1.this.z(this.f22155a);
        }
    }

    class g extends p3.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f22158a;

        g(i iVar) {
            this.f22158a = iVar;
        }

        @Override // com.onesignal.p3.g
        void a(int i10, String str, Throwable th) {
            o1.this.u("html", i10, str);
            this.f22158a.b(str);
        }

        @Override // com.onesignal.p3.g
        void b(String str) {
            this.f22158a.a(str);
        }
    }

    class h extends p3.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f22160a;

        h(i iVar) {
            this.f22160a = iVar;
        }

        @Override // com.onesignal.p3.g
        void a(int i10, String str, Throwable th) throws JSONException {
            o1.this.u("html", i10, str);
            JSONObject jSONObject = new JSONObject();
            try {
                if (!OSUtils.U(i10) || o1.this.f22130d >= OSUtils.f21657a) {
                    o1.this.f22130d = 0;
                    jSONObject.put("retry", false);
                } else {
                    o1.g(o1.this);
                    jSONObject.put("retry", true);
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            this.f22160a.b(jSONObject.toString());
        }

        @Override // com.onesignal.p3.g
        void b(String str) {
            o1.this.f22130d = 0;
            this.f22160a.a(str);
        }
    }

    interface i {
        void a(String str);

        void b(String str);
    }

    o1(l3 l3Var, r1 r1Var, n2 n2Var) {
        this.f22127a = l3Var;
        this.f22128b = r1Var;
        this.f22129c = n2Var;
    }

    static /* synthetic */ int g(o1 o1Var) {
        int i10 = o1Var.f22130d;
        o1Var.f22130d = i10 + 1;
        return i10;
    }

    private void i(Set set) {
        String str;
        Set setG;
        if (set == null || set.size() <= 0 || (setG = n3.g((str = n3.f22119a), "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null)) == null || setG.size() <= 0) {
            return;
        }
        setG.removeAll(set);
        n3.n(str, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", setG);
    }

    private void j(Set set) {
        if (set == null || set.size() <= 0) {
            return;
        }
        String str = n3.f22119a;
        Set setG = n3.g(str, "PREFS_OS_DISPLAYED_IAMS", null);
        Set setG2 = n3.g(str, "PREFS_OS_IMPRESSIONED_IAMS", null);
        if (setG != null && setG.size() > 0) {
            setG.removeAll(set);
            n3.n(str, "PREFS_OS_DISPLAYED_IAMS", setG);
        }
        if (setG2 == null || setG2.size() <= 0) {
            return;
        }
        setG2.removeAll(set);
        n3.n(str, "PREFS_OS_IMPRESSIONED_IAMS", setG2);
    }

    private String t(String str, String str2, String str3) {
        if (str2 == null) {
            this.f22128b.a("Unable to find a variant for in-app message " + str);
            return null;
        }
        return "in_app_messages/" + str + "/variants/" + str2 + "/html?app_id=" + str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(String str, int i10, String str2) {
        this.f22128b.a("Encountered a " + i10 + " error while attempting in-app message " + str + " request: " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str, String str2) {
        this.f22128b.f("Successful post for in-app message " + str + " request: " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Set set) {
        this.f22129c.i(n3.f22119a, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(Set set) {
        this.f22129c.i(n3.f22119a, "PREFS_OS_IMPRESSIONED_IAMS", set);
    }

    synchronized void A(f1 f1Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", f1Var.f21691a);
        contentValues.put("display_quantity", Integer.valueOf(f1Var.e().a()));
        contentValues.put("last_display", Long.valueOf(f1Var.e().b()));
        contentValues.put("click_ids", f1Var.c().toString());
        contentValues.put("displayed_in_session", Boolean.valueOf(f1Var.g()));
        if (this.f22127a.f("in_app_message", contentValues, "message_id = ?", new String[]{f1Var.f21691a}) == 0) {
            this.f22127a.e("in_app_message", null, contentValues);
        }
    }

    void B(Date date) {
        this.f22129c.b(n3.f22119a, "PREFS_OS_LAST_TIME_IAM_DISMISSED", date != null ? date.toString() : null);
    }

    void C(Set set) {
        this.f22129c.i(n3.f22119a, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", set);
    }

    void D(String str, String str2, String str3, int i10, String str4, String str5, boolean z10, Set set, i iVar) {
        try {
            p3.j("in_app_messages/" + str4 + "/click", new a(str, i10, str2, str5, str3, z10), new b(set, iVar));
        } catch (JSONException e5) {
            e5.printStackTrace();
            this.f22128b.a("Unable to execute in-app message action HTTP request due to invalid JSON");
        }
    }

    void E(String str, String str2, String str3, int i10, String str4, Set set, i iVar) {
        try {
            p3.j("in_app_messages/" + str4 + "/impression", new e(str, str2, str3, i10), new f(set, iVar));
        } catch (JSONException e5) {
            e5.printStackTrace();
            this.f22128b.a("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    void F(String str, String str2, String str3, int i10, String str4, String str5, Set set, i iVar) {
        try {
            p3.j("in_app_messages/" + str4 + "/pageImpression", new c(str, str2, str3, i10, str5), new d(set, iVar));
        } catch (JSONException e5) {
            e5.printStackTrace();
            this.f22128b.a("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    synchronized void h() {
        String[] strArr = {"message_id", "click_ids"};
        String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - 15552000)};
        Set setK = OSUtils.K();
        Set setK2 = OSUtils.K();
        Cursor cursorA = null;
        try {
            try {
                cursorA = this.f22127a.a("in_app_message", strArr, "last_display < ?", strArr2, null, null, null);
            } catch (JSONException e5) {
                e5.printStackTrace();
                if (0 != 0 && !cursorA.isClosed()) {
                }
            }
            if (cursorA != null && cursorA.getCount() != 0) {
                if (cursorA.moveToFirst()) {
                    do {
                        String string = cursorA.getString(cursorA.getColumnIndex("message_id"));
                        String string2 = cursorA.getString(cursorA.getColumnIndex("click_ids"));
                        setK.add(string);
                        setK2.addAll(OSUtils.L(new JSONArray(string2)));
                    } while (cursorA.moveToNext());
                }
                if (!cursorA.isClosed()) {
                    cursorA.close();
                }
                this.f22127a.c("in_app_message", "last_display < ?", strArr2);
                j(setK);
                i(setK2);
                return;
            }
            e3.i1(e3.z.DEBUG, "Attempted to clean 6 month old IAM data, but none exists!");
        } finally {
            if (0 != 0 && !cursorA.isClosed()) {
                cursorA.close();
            }
        }
    }

    synchronized List k() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursorA = null;
        try {
            try {
                cursorA = this.f22127a.a("in_app_message", null, null, null, null, null, null);
                if (cursorA.moveToFirst()) {
                    do {
                        String string = cursorA.getString(cursorA.getColumnIndex("message_id"));
                        String string2 = cursorA.getString(cursorA.getColumnIndex("click_ids"));
                        int i10 = cursorA.getInt(cursorA.getColumnIndex("display_quantity"));
                        long j10 = cursorA.getLong(cursorA.getColumnIndex("last_display"));
                        boolean z10 = true;
                        if (cursorA.getInt(cursorA.getColumnIndex("displayed_in_session")) != 1) {
                            z10 = false;
                        }
                        arrayList.add(new f1(string, OSUtils.L(new JSONArray(string2)), z10, new n1(i10, j10)));
                    } while (cursorA.moveToNext());
                }
            } catch (JSONException e5) {
                e3.b(e3.z.ERROR, "Generating JSONArray from iam click ids:JSON Failed.", e5);
                if (cursorA != null && !cursorA.isClosed()) {
                }
            }
            if (!cursorA.isClosed()) {
                cursorA.close();
            }
        } catch (Throwable th) {
            if (cursorA != null && !cursorA.isClosed()) {
                cursorA.close();
            }
            throw th;
        }
        return arrayList;
    }

    Set l() {
        return this.f22129c.d(n3.f22119a, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
    }

    Set m() {
        return this.f22129c.d(n3.f22119a, "PREFS_OS_DISPLAYED_IAMS", null);
    }

    void n(String str, String str2, String str3, i iVar) {
        p3.e(t(str2, str3, str), new h(iVar), null);
    }

    void o(String str, String str2, i iVar) throws InterruptedException {
        p3.e("in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, new g(iVar), null);
    }

    Set p() {
        return this.f22129c.d(n3.f22119a, "PREFS_OS_IMPRESSIONED_IAMS", null);
    }

    Date q() {
        String strG = this.f22129c.g(n3.f22119a, "PREFS_OS_LAST_TIME_IAM_DISMISSED", null);
        if (strG == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(strG);
        } catch (ParseException e5) {
            e3.i1(e3.z.ERROR, e5.getLocalizedMessage());
            return null;
        }
    }

    String r() {
        return this.f22129c.g(n3.f22119a, "PREFS_OS_CACHED_IAMS", null);
    }

    Set s() {
        return this.f22129c.d(n3.f22119a, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", null);
    }

    void x(Set set) {
        this.f22129c.i(n3.f22119a, "PREFS_OS_DISPLAYED_IAMS", set);
    }

    void y(String str) {
        this.f22129c.b(n3.f22119a, "PREFS_OS_CACHED_IAMS", str);
    }
}
