package j7;

import android.content.ContentValues;
import android.database.Cursor;
import com.onesignal.k3;
import com.onesignal.n2;
import com.onesignal.r1;
import h7.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final r1 f24542a;

    /* renamed from: b, reason: collision with root package name */
    private final k3 f24543b;

    /* renamed from: c, reason: collision with root package name */
    private final n2 f24544c;

    /* renamed from: j7.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0147a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24545a;

        static {
            int[] iArr = new int[h7.c.values().length];
            iArr[h7.c.DIRECT.ordinal()] = 1;
            iArr[h7.c.INDIRECT.ordinal()] = 2;
            f24545a = iArr;
        }
    }

    public a(r1 r1Var, k3 k3Var, n2 n2Var) {
        rb.h.e(r1Var, "logger");
        rb.h.e(k3Var, "dbHelper");
        rb.h.e(n2Var, "preferences");
        this.f24542a = r1Var;
        this.f24543b = k3Var;
        this.f24544c = n2Var;
    }

    private final void a(List list, JSONArray jSONArray, h7.b bVar) throws JSONException {
        if (jSONArray == null) {
            return;
        }
        int i10 = 0;
        int length = jSONArray.length();
        if (length <= 0) {
            return;
        }
        while (true) {
            int i11 = i10 + 1;
            try {
                String string = jSONArray.getString(i10);
                rb.h.d(string, "influenceId");
                list.add(new k7.a(string, bVar));
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            if (i11 >= length) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    private final void b(List list, k7.e eVar) throws JSONException {
        if (eVar == null) {
            return;
        }
        JSONArray jSONArrayA = eVar.a();
        JSONArray jSONArrayB = eVar.b();
        a(list, jSONArrayA, h7.b.IAM);
        a(list, jSONArrayB, h7.b.NOTIFICATION);
    }

    private final k7.d f(h7.c cVar, k7.e eVar, k7.e eVar2, String str, k7.d dVar) {
        int i10 = C0147a.f24545a[cVar.ordinal()];
        if (i10 == 1) {
            eVar.c(new JSONArray(str));
            k7.d dVarC = dVar == null ? null : dVar.c(eVar);
            return dVarC == null ? new k7.d(eVar, null) : dVarC;
        }
        if (i10 != 2) {
            return dVar;
        }
        eVar2.c(new JSONArray(str));
        k7.d dVarE = dVar == null ? null : dVar.e(eVar2);
        return dVarE == null ? new k7.d(null, eVar2) : dVarE;
    }

    private final k7.d h(h7.c cVar, k7.e eVar, k7.e eVar2, String str) {
        k7.d dVar;
        int i10 = C0147a.f24545a[cVar.ordinal()];
        if (i10 == 1) {
            eVar.d(new JSONArray(str));
            dVar = new k7.d(eVar, null);
        } else {
            if (i10 != 2) {
                return null;
            }
            eVar2.d(new JSONArray(str));
            dVar = new k7.d(null, eVar2);
        }
        return dVar;
    }

    public final synchronized void c(String str, String str2) {
        rb.h.e(str, "notificationTableName");
        rb.h.e(str2, "notificationIdColumnName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NOT EXISTS(SELECT NULL FROM ");
        sb2.append(str);
        sb2.append(" n WHERE n.");
        sb2.append(str2);
        sb2.append(" = channel_influence_id AND channel_type = \"");
        String string = h7.b.NOTIFICATION.toString();
        Locale locale = Locale.ROOT;
        rb.h.d(locale, "ROOT");
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = string.toLowerCase(locale);
        rb.h.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        sb2.append(lowerCase);
        sb2.append("\")");
        this.f24543b.c("cached_unique_outcome", sb2.toString(), null);
    }

    public final synchronized void d(k7.b bVar) {
        rb.h.e(bVar, "event");
        this.f24543b.c("outcome", "timestamp = ?", new String[]{String.valueOf(bVar.c())});
    }

    public final synchronized List e() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorA = this.f24543b.a("outcome", null, null, null, null, null, null);
            try {
                if (cursorA.moveToFirst()) {
                    do {
                        String string = cursorA.getString(cursorA.getColumnIndex("notification_influence_type"));
                        c.a aVar = h7.c.f24092m;
                        h7.c cVarA = aVar.a(string);
                        h7.c cVarA2 = aVar.a(cursorA.getString(cursorA.getColumnIndex("iam_influence_type")));
                        String string2 = cursorA.getString(cursorA.getColumnIndex("notification_ids"));
                        if (string2 == null) {
                            string2 = "[]";
                        }
                        String string3 = cursorA.getString(cursorA.getColumnIndex("iam_ids"));
                        if (string3 == null) {
                            string3 = "[]";
                        }
                        String str = string3;
                        String string4 = cursorA.getString(cursorA.getColumnIndex("name"));
                        float f5 = cursorA.getFloat(cursorA.getColumnIndex("weight"));
                        long j10 = cursorA.getLong(cursorA.getColumnIndex("timestamp"));
                        try {
                            k7.e eVar = new k7.e(null, null, 3, null);
                            k7.e eVar2 = new k7.e(null, null, 3, null);
                            k7.d dVarH = h(cVarA, eVar, eVar2, string2);
                            f(cVarA2, eVar, eVar2, str, dVarH);
                            if (dVarH == null) {
                                dVarH = new k7.d(null, null);
                            }
                            rb.h.d(string4, "name");
                            arrayList.add(new k7.b(string4, dVarH, f5, j10));
                        } catch (JSONException e5) {
                            this.f24542a.d("Generating JSONArray from notifications ids outcome:JSON Failed.", e5);
                        }
                    } while (cursorA.moveToNext());
                }
                if (!cursorA.isClosed()) {
                    cursorA.close();
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorA;
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return arrayList;
    }

    public final synchronized List g(String str, List list) {
        ArrayList arrayList;
        rb.h.e(str, "name");
        rb.h.e(list, "influences");
        arrayList = new ArrayList();
        Cursor cursorG = null;
        try {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    h7.a aVar = (h7.a) it.next();
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArrayB = aVar.b();
                    if (jSONArrayB != null) {
                        int length = jSONArrayB.length();
                        if (length > 0) {
                            int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                String string = jSONArrayB.getString(i10);
                                cursorG = this.f24543b.g("cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", new String[]{string, aVar.c().toString(), str}, null, null, null, "1");
                                if (cursorG.getCount() == 0) {
                                    jSONArray.put(string);
                                }
                                if (i11 >= length) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        if (jSONArray.length() > 0) {
                            h7.a aVarA = aVar.a();
                            aVarA.e(jSONArray);
                            arrayList.add(aVarA);
                        }
                    }
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
                if (cursorG != null && !cursorG.isClosed()) {
                }
            }
            if (cursorG != null && !cursorG.isClosed()) {
                cursorG.close();
            }
        } catch (Throwable th) {
            if (0 != 0 && !cursorG.isClosed()) {
                cursorG.close();
            }
            throw th;
        }
        return arrayList;
    }

    public final Set i() {
        n2 n2Var = this.f24544c;
        return n2Var.d(n2Var.h(), "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", null);
    }

    public final boolean j() {
        n2 n2Var = this.f24544c;
        return n2Var.f(n2Var.h(), this.f24544c.j(), false);
    }

    public final synchronized void k(k7.b bVar) {
        k7.e eVarA;
        h7.c cVar;
        h7.c cVar2;
        k7.e eVarB;
        rb.h.e(bVar, "eventParams");
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        h7.c cVar3 = h7.c.UNATTRIBUTED;
        k7.d dVarB = bVar.b();
        if (dVarB == null || (eVarA = dVarB.a()) == null) {
            cVar2 = cVar3;
        } else {
            JSONArray jSONArrayB = eVarA.b();
            if (jSONArrayB != null && jSONArrayB.length() > 0) {
                cVar = h7.c.DIRECT;
                jSONArray = jSONArrayB;
            } else {
                cVar = cVar3;
            }
            JSONArray jSONArrayA = eVarA.a();
            if (jSONArrayA != null && jSONArrayA.length() > 0) {
                cVar3 = h7.c.DIRECT;
                jSONArray2 = jSONArrayA;
            }
            cVar2 = cVar3;
            cVar3 = cVar;
        }
        k7.d dVarB2 = bVar.b();
        if (dVarB2 != null && (eVarB = dVarB2.b()) != null) {
            JSONArray jSONArrayB2 = eVarB.b();
            if (jSONArrayB2 != null && jSONArrayB2.length() > 0) {
                cVar3 = h7.c.INDIRECT;
                jSONArray = jSONArrayB2;
            }
            JSONArray jSONArrayA2 = eVarB.a();
            if (jSONArrayA2 != null && jSONArrayA2.length() > 0) {
                cVar2 = h7.c.INDIRECT;
                jSONArray2 = jSONArrayA2;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("notification_ids", jSONArray.toString());
        contentValues.put("iam_ids", jSONArray2.toString());
        String string = cVar3.toString();
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = string.toLowerCase();
        rb.h.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        contentValues.put("notification_influence_type", lowerCase);
        String string2 = cVar2.toString();
        if (string2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase2 = string2.toLowerCase();
        rb.h.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
        contentValues.put("iam_influence_type", lowerCase2);
        contentValues.put("name", bVar.a());
        contentValues.put("weight", Float.valueOf(bVar.d()));
        contentValues.put("timestamp", Long.valueOf(bVar.c()));
        this.f24543b.e("outcome", null, contentValues);
    }

    public final void l(Set set) {
        n2 n2Var = this.f24544c;
        String strH = n2Var.h();
        rb.h.b(set);
        n2Var.i(strH, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }

    public final synchronized void m(k7.b bVar) {
        rb.h.e(bVar, "eventParams");
        this.f24542a.f(rb.h.j("OneSignal saveUniqueOutcomeEventParams: ", bVar));
        String strA = bVar.a();
        ArrayList<k7.a> arrayList = new ArrayList();
        k7.d dVarB = bVar.b();
        k7.e eVarA = dVarB == null ? null : dVarB.a();
        k7.d dVarB2 = bVar.b();
        k7.e eVarB = dVarB2 == null ? null : dVarB2.b();
        b(arrayList, eVarA);
        b(arrayList, eVarB);
        for (k7.a aVar : arrayList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("channel_influence_id", aVar.b());
            contentValues.put("channel_type", aVar.a().toString());
            contentValues.put("name", strA);
            this.f24543b.e("cached_unique_outcome", null, contentValues);
        }
    }
}
