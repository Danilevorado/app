package com.webviewgold.myappname.nfc;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.os.Parcelable;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import com.webviewgold.myappname.d;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public class MyNfcActivity extends c {
    private NfcAdapter M;
    private PendingIntent N;
    private IntentFilter[] O;
    private boolean P;
    private Tag Q;
    private Context R;

    private void c0() {
        this.P = false;
        this.M.disableForegroundDispatch(this);
    }

    private void d0() {
        this.P = true;
        this.M.enableForegroundDispatch(this, this.N, this.O, null);
    }

    private NdefRecord e0(String str) throws UnsupportedEncodingException {
        byte[] bytes = str.getBytes();
        byte[] bytes2 = "en".getBytes("US-ASCII");
        int length = bytes2.length;
        int length2 = bytes.length;
        int i10 = length + 1;
        byte[] bArr = new byte[i10 + length2];
        bArr[0] = (byte) length;
        System.arraycopy(bytes2, 0, bArr, 1, length);
        System.arraycopy(bytes, 0, bArr, i10, length2);
        return new NdefRecord((short) 1, NdefRecord.RTD_TEXT, new byte[0], bArr);
    }

    private void f0(NdefMessage[] ndefMessageArr) {
        String str;
        if (ndefMessageArr == null || ndefMessageArr.length == 0) {
            return;
        }
        byte[] payload = ndefMessageArr[0].getRecords()[0].getPayload();
        try {
            str = new String(payload, (payload[0] & 51) + 1, (payload.length - r0) - 1, (payload[0] & 128) == 0 ? "UTF-8" : "UTF-16");
        } catch (UnsupportedEncodingException e5) {
            if (d.f22733a.booleanValue()) {
                Log.d("UnsupportedEncoding", e5.toString());
            }
            str = "";
        }
        TextView textView = new TextView(this);
        textView.setPadding(16, 16, 16, 16);
        textView.setTextColor(-16776961);
        textView.setText("read : " + str);
    }

    private void g0(Intent intent) {
        String action = intent.getAction();
        if ("android.nfc.action.TAG_DISCOVERED".equals(action) || "android.nfc.action.TECH_DISCOVERED".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) {
            Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
            NdefMessage[] ndefMessageArr = null;
            if (parcelableArrayExtra != null) {
                ndefMessageArr = new NdefMessage[parcelableArrayExtra.length];
                for (int i10 = 0; i10 < parcelableArrayExtra.length; i10++) {
                    ndefMessageArr[i10] = (NdefMessage) parcelableArrayExtra[i10];
                }
            }
            f0(ndefMessageArr);
        }
    }

    private void h0(String str) {
        Toast.makeText(this.R, str, 0).show();
    }

    private void i0(String str, Tag tag) throws IOException, FormatException {
        j0(tag, new NdefMessage(new NdefRecord[]{e0(str)}));
    }

    public void j0(Tag tag, NdefMessage ndefMessage) throws IOException, FormatException {
        if (tag != null) {
            try {
                Ndef ndef = Ndef.get(tag);
                if (ndef == null) {
                    NdefFormatable ndefFormatable = NdefFormatable.get(tag);
                    if (ndefFormatable == null) {
                        return;
                    }
                    ndefFormatable.connect();
                    ndefFormatable.format(ndefMessage);
                    ndefFormatable.close();
                } else {
                    ndef.connect();
                    ndef.writeNdefMessage(ndefMessage);
                    ndef.close();
                }
                h0("Text written to the NFC tag successfully!");
            } catch (Exception e5) {
                e5.printStackTrace();
                h0("write error : " + e5.getMessage());
            }
        }
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        g0(intent);
        if ("android.nfc.action.TAG_DISCOVERED".equals(intent.getAction())) {
            this.Q = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
            h0("tag detected : " + this.Q.toString());
            try {
                i0("test_write", this.Q);
            } catch (FormatException | IOException e5) {
                e5.printStackTrace();
                Toast.makeText(this.R, "Error during writing, is the NFC tag close enough to your device?", 1).show();
            }
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public void onPause() {
        super.onPause();
        c0();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public void onResume() {
        super.onResume();
        d0();
    }
}
