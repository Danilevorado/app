package e4;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import e4.j;

/* loaded from: classes.dex */
public abstract class a extends j.a {
    public static Account L0(j jVar) {
        Account accountB = null;
        if (jVar != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    accountB = jVar.b();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return accountB;
    }
}
