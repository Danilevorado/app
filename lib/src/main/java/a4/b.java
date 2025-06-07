package a4;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f105a;

    public b() {
        q4.e.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new j4.b("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f105a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    private final int e(Context context, Intent intent) {
        b5.i iVarC;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            iVarC = b5.l.e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            iVarC = x.b(context).c(2, bundle);
        }
        int iB = b(context, new a(intent));
        try {
            b5.l.b(iVarC, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            String strValueOf = String.valueOf(e5);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
            sb2.append("Message ack failed: ");
            sb2.append(strValueOf);
            Log.w("CloudMessagingReceiver", sb2.toString());
        }
        return iB;
    }

    private final int f(Context context, Intent intent) throws PendingIntent.CanceledException {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    protected Executor a() {
        return this.f105a;
    }

    protected abstract int b(Context context, a aVar);

    protected abstract void c(Context context, Bundle bundle);

    public final /* synthetic */ void d(Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int iF = intent2 != null ? f(context, intent2) : e(context, intent);
            if (z10) {
                pendingResult.setResultCode(iF);
            }
        } finally {
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        a().execute(new Runnable() { // from class: a4.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f126m.d(intent, context, zIsOrderedBroadcast, pendingResultGoAsync);
            }
        });
    }
}
