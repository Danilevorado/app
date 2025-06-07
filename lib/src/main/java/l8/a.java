package l8;

import b5.l;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public abstract class a {
    public static void a() throws ExecutionException, InterruptedException {
        try {
            l.a(FirebaseMessaging.o().l());
        } catch (InterruptedException e5) {
            throw new InterruptedException("Failed to delete Firebase token: " + e5.getMessage());
        } catch (ExecutionException e10) {
            throw new ExecutionException(new Throwable("Failed to delete Firebase token: " + e10.getMessage()));
        }
    }

    public static String b() throws ExecutionException, InterruptedException {
        try {
            return (String) l.a(FirebaseMessaging.o().r());
        } catch (InterruptedException e5) {
            throw new InterruptedException("Failed to fetch push token from FCM: " + e5.getMessage());
        } catch (ExecutionException e10) {
            throw new ExecutionException(new Throwable("Failed to fetch push token from FCM: " + e10.getMessage()));
        }
    }
}
