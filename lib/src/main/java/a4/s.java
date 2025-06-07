package a4;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final Messenger f145a;

    /* renamed from: b, reason: collision with root package name */
    private final i f146b;

    s(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f145a = new Messenger(iBinder);
            this.f146b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f146b = new i(iBinder);
            this.f145a = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    final void a(Message message) throws RemoteException {
        Messenger messenger = this.f145a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        i iVar = this.f146b;
        if (iVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        iVar.b(message);
    }
}
