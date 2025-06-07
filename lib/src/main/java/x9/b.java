package x9;

import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import k9.h;
import k9.i;
import org.json.JSONException;
import org.json.JSONObject;
import w9.a;
import w9.k;

/* loaded from: classes2.dex */
public abstract class b {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28370a;

        static {
            int[] iArr = new int[a.EnumC0207a.values().length];
            f28370a = iArr;
            try {
                iArr[a.EnumC0207a.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28370a[a.EnumC0207a.BROADCAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void b(Context context, q8.a aVar, w9.a aVar2) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        int iB;
        if (aVar2.c() != null) {
            if (aVar2.c().startsWith("android.R.drawable")) {
                String strReplace = aVar2.c().replace("android.R.drawable.", "");
                iB = 0;
                for (Field field : R.drawable.class.getFields()) {
                    try {
                        if (strReplace.equalsIgnoreCase(field.getName())) {
                            iB = field.getInt(field);
                        }
                    } catch (Exception e5) {
                        h.o(e5);
                    }
                }
            } else {
                iB = 0;
            }
            if (iB == 0) {
                iB = c9.a.j().b(aVar2.c(), "drawable");
            }
        } else {
            iB = 0;
        }
        String strE = aVar2.e();
        String strD = aVar2.d();
        Intent intent = new Intent();
        String strG = aVar2.g();
        if (strG != null) {
            intent = new Intent(strD, Uri.parse(strG));
        }
        Class<?> clsA = aVar2.a();
        if (clsA != null) {
            intent.setClass(context, clsA);
        }
        if (strD != null) {
            intent.setAction(strD);
        }
        JSONObject jSONObjectB = aVar2.b();
        if (jSONObjectB != null) {
            Iterator<String> itKeys = jSONObjectB.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    intent.putExtra(next, jSONObjectB.getString(next));
                } catch (JSONException e10) {
                    h.o(e10);
                }
            }
        }
        int i10 = a.f28370a[aVar2.f().ordinal()];
        PendingIntent service = i10 != 1 ? i10 != 2 ? PendingIntent.getService(context, 0, intent, i.a(134217728)) : PendingIntent.getBroadcast(context, 0, intent, i.a(134217728)) : PendingIntent.getActivity(context, 0, intent, i.a(134217728));
        if (service != null) {
            aVar.l(iB, strE, service);
        }
    }

    public static void c(String str) {
        int iE = k.e(str);
        if (iE != -1) {
            i().cancel(iE);
            try {
                ka.e.i().remove(str);
            } catch (s7.a unused) {
                h.k("Failed to remove entry for group id " + str + " from summaryNotificationStorage");
            }
        }
    }

    public static void d(String str) throws PendingIntent.CanceledException {
        r9.a aVarC = ka.e.e().c(str);
        NotificationManager notificationManagerI = i();
        if (Build.VERSION.SDK_INT >= 24) {
            for (StatusBarNotification statusBarNotification : h(str)) {
                if (statusBarNotification.getId() == aVarC.a()) {
                    statusBarNotification.getNotification().contentIntent.send();
                    notificationManagerI.cancel(aVarC.a());
                }
            }
            if (g().size() == 0) {
                c(str);
            }
        }
        ka.e.e().g(aVarC.b());
    }

    public static q8.a e(Context context, String str) {
        return Build.VERSION.SDK_INT >= 26 ? new e(context, str) : new d(context, str);
    }

    public static q8.b f(Context context, String str) {
        return new f(context, str);
    }

    public static List g() {
        ArrayList arrayList = new ArrayList();
        NotificationManager notificationManagerI = c9.a.e().i();
        if (notificationManagerI != null) {
            try {
                for (StatusBarNotification statusBarNotification : notificationManagerI.getActiveNotifications()) {
                    boolean zJ = j(statusBarNotification);
                    boolean zIsGroup = statusBarNotification.isGroup();
                    if (!zJ && zIsGroup) {
                        arrayList.add(statusBarNotification);
                    }
                }
            } catch (Throwable unused) {
                return Collections.emptyList();
            }
        } else {
            h.k("Incorrect state of app. Context is null");
        }
        return arrayList;
    }

    public static List h(final String str) {
        return (List) g().stream().filter(new Predicate() { // from class: x9.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b.l(str, (StatusBarNotification) obj);
            }
        }).collect(Collectors.toList());
    }

    private static NotificationManager i() {
        Context contextB = c9.a.b();
        Objects.requireNonNull(contextB);
        return (NotificationManager) contextB.getSystemService("notification");
    }

    public static boolean j(StatusBarNotification statusBarNotification) {
        return (statusBarNotification.getNotification().flags & 512) != 0;
    }

    public static boolean k(w9.d dVar, List list) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(dVar.p())) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) it.next();
            if (statusBarNotification.getId() == 0 && TextUtils.equals(dVar.p(), statusBarNotification.getTag())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean l(String str, StatusBarNotification statusBarNotification) {
        return TextUtils.equals(statusBarNotification.getNotification().getGroup(), str);
    }
}
