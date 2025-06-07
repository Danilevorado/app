package f6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f23656a;

    public l(Context context, String str) {
        this.f23656a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        long j10 = this.f23656a.getLong("fire-count", 0L);
        String str = null;
        String key = "";
        for (Map.Entry<String, ?> entry : this.f23656a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str2) > 0) {
                        key = entry.getKey();
                        str = str2;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f23656a.getStringSet(key, new HashSet()));
        hashSet.remove(str);
        this.f23656a.edit().putStringSet(key, hashSet).putLong("fire-count", j10 - 1).commit();
    }

    private synchronized String d(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    private synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f23656a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void h(String str) {
        String strE = e(str);
        if (strE == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f23656a.getStringSet(strE, new HashSet()));
        hashSet.remove(str);
        (hashSet.isEmpty() ? this.f23656a.edit().remove(strE) : this.f23656a.edit().putStringSet(strE, hashSet)).commit();
    }

    synchronized void b() {
        SharedPreferences.Editor editorEdit = this.f23656a.edit();
        for (Map.Entry<String, ?> entry : this.f23656a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                editorEdit.remove(entry.getKey());
            }
        }
        editorEdit.remove("fire-count");
        editorEdit.commit();
    }

    synchronized List c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f23656a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(m.a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        l(System.currentTimeMillis());
        return arrayList;
    }

    synchronized boolean f(long j10, long j11) {
        return d(j10).equals(d(j11));
    }

    synchronized void g() {
        String strD = d(System.currentTimeMillis());
        this.f23656a.edit().putString("last-used-date", strD).commit();
        h(strD);
    }

    synchronized boolean i(long j10) {
        return j("fire-global", j10);
    }

    synchronized boolean j(String str, long j10) {
        if (!this.f23656a.contains(str)) {
            this.f23656a.edit().putLong(str, j10).commit();
            return true;
        }
        if (f(this.f23656a.getLong(str, -1L), j10)) {
            return false;
        }
        this.f23656a.edit().putLong(str, j10).commit();
        return true;
    }

    synchronized void k(long j10, String str) {
        String strD = d(j10);
        if (this.f23656a.getString("last-used-date", "").equals(strD)) {
            return;
        }
        long j11 = this.f23656a.getLong("fire-count", 0L);
        if (j11 + 1 == 30) {
            a();
            j11 = this.f23656a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f23656a.getStringSet(str, new HashSet()));
        hashSet.add(strD);
        this.f23656a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", strD).commit();
    }

    synchronized void l(long j10) {
        this.f23656a.edit().putLong("fire-global", j10).commit();
    }
}
