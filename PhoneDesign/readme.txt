Adapter Design Pattern - 
I have created Adapter design pattern where CallerTune and PhoneSettings are the Interfaces, ChangeDisplay and musicLibrary is concrete classes, PhoneSettingAdapter is adapter class implementing the CallerTune interface and PhoneInvoker is a concrete class implements CallerTune. My main class is ChatAdapterMain.

Command Design Pattern - 
I have created Command Design Pattern where PhoneSettings is the interface, AppRequest is the request class, AllowApp and DenyApp is a concrete class implements PhoneSettings, AppServer is the broker class. The AppCommandMain is the main class. In result we can see if the application is allowed or denied.

Facade Design Pattern - 
I have created PhoneFacadeMain as the main class, PhoneNotification as interface, WhatsaapNotify, CallNotify and FacebookNotify as concrete classes implementing the same interface and PhoneServer as facade class.

Factory Design Pattern - 
I have created PhoneFactoryMain as the main class, PhoneNotification as interface, WhatsaapNotify, CallNotify and FacebookNotify as concrete classes implementing the same interface and PhoneServer as factory class to generate object of concrete class.