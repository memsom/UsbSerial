package com.felhr.usbserial;

// Usb Read Callback
public interface UsbReadCallback
{
    void onReceivedData(byte[] data);
}
