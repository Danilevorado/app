package a4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class d {

    /* renamed from: h, reason: collision with root package name */
    private static int f110h;

    /* renamed from: i, reason: collision with root package name */
    private static PendingIntent f111i;

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f112j = new Executor() { // from class: a4.e0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f113k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    private final Context f115b;

    /* renamed from: c, reason: collision with root package name */
    private final y f116c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f117d;

    /* renamed from: f, reason: collision with root package name */
    private Messenger f119f;

    /* renamed from: g, reason: collision with root package name */
    private i f120g;

    /* renamed from: a, reason: collision with root package name */
    private final q.g f114a = new q.g();

    /* renamed from: e, reason: collision with root package name */
    private Messenger f118e = new Messenger(new f(this, Looper.getMainLooper()));

    public d(Context context) {
        this.f115b = context;
        this.f116c = new y(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f117d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ b5.i b(Bundle bundle) {
        return j(bundle) ? b5.l.e(null) : b5.l.e(bundle);
    }

    static /* bridge */ /* synthetic */ void d(d dVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new h());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof i) {
                        dVar.f120g = (i) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        dVar.f119f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String strValueOf = String.valueOf(action);
                        Log.d("Rpc", strValueOf.length() != 0 ? "Unexpected response action: ".concat(strValueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f113k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        dVar.i(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String strValueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 49);
                    sb2.append("Unexpected response, no error or registration id ");
                    sb2.append(strValueOf2);
                    Log.w("Rpc", sb2.toString());
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (dVar.f114a) {
                        for (int i10 = 0; i10 < dVar.f114a.size(); i10++) {
                            dVar.i((String) dVar.f114a.i(i10), intent2.getExtras());
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !"ID".equals(strArrSplit[1])) {
                    Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                dVar.i(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final b5.i f(Bundle bundle) throws RemoteException {
        final String strG = g();
        final b5.j jVar = new b5.j();
        synchronized (this.f114a) {
            this.f114a.put(strG, jVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f116c.b() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        h(this.f115b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strG).length() + 5);
        sb2.append("|ID|");
        sb2.append(strG);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(strValueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f118e);
        if (this.f119f != null || this.f120g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f119f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f120g.b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.f116c.b() == 2) {
            this.f115b.sendBroadcast(intent);
        } else {
            this.f115b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f117d.schedule(new Runnable() { // from class: a4.d0
            @Override // java.lang.Runnable
            public final void run() {
                if (jVar.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        jVar.a().c(f112j, new b5.d() { // from class: a4.b0
            @Override // b5.d
            public final void a(b5.i iVar) {
                this.f106a.e(strG, scheduledFutureSchedule, iVar);
            }
        });
        return jVar.a();
    }

    private static synchronized String g() {
        int i10;
        i10 = f110h;
        f110h = i10 + 1;
        return Integer.toString(i10);
    }

    private static synchronized void h(Context context, Intent intent) {
        if (f111i == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            f111i = q4.a.a(context, 0, intent2, q4.a.f26288a);
        }
        intent.putExtra("app", f111i);
    }

    private final void i(String str, Bundle bundle) {
        synchronized (this.f114a) {
            b5.j jVar = (b5.j) this.f114a.remove(str);
            if (jVar != null) {
                jVar.c(bundle);
            } else {
                String strValueOf = String.valueOf(str);
                Log.w("Rpc", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
            }
        }
    }

    private static boolean j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public b5.i a(final Bundle bundle) {
        return this.f116c.a() < 12000000 ? this.f116c.b() != 0 ? f(bundle).h(f112j, new b5.a() { // from class: a4.z
            @Override // b5.a
            public final Object a(b5.i iVar) {
                return this.f159a.c(bundle, iVar);
            }
        }) : b5.l.d(new IOException("MISSING_INSTANCEID_SERVICE")) : x.b(this.f115b).d(1, bundle).f(f112j, new b5.a() { // from class: a4.a0
            @Override // b5.a
            public final Object a(b5.i iVar) throws IOException {
                if (iVar.n()) {
                    return (Bundle) iVar.j();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String strValueOf = String.valueOf(iVar.i());
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22);
                    sb2.append("Error making request: ");
                    sb2.append(strValueOf);
                    Log.d("Rpc", sb2.toString());
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", iVar.i());
            }
        });
    }

    public final /* synthetic */ b5.i c(Bundle bundle, b5.i iVar) {
        return (iVar.n() && j((Bundle) iVar.j())) ? f(bundle).o(f112j, new b5.h() { // from class: a4.c0
            @Override // b5.h
            public final b5.i a(Object obj) {
                return d.b((Bundle) obj);
            }
        }) : iVar;
    }

    public final /* synthetic */ void e(String str, ScheduledFuture scheduledFuture, b5.i iVar) {
        synchronized (this.f114a) {
            this.f114a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
