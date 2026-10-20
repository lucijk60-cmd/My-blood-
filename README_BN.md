# Blood Alert Android Starter

এই ZIP-এ Android Studio Java/WebView project, HTML/CSS/JS UI এবং আপলোড করা Firebase `google-services.json` রাখা হয়েছে।

## Firebase তথ্য
- Package name: `com.htmltoapk.blood`
- Project ID: `gen-lang-client-0827143271`

## চালানোর ধাপ
1. ZIP extract করুন।
2. Android Studio → Open → `BloodAlert_Android_Complete` ফোল্ডার খুলুন।
3. Gradle sync শেষ হতে দিন।
4. ফোনে Run করুন অথবা Build → Build APK(s) চাপুন।

## গুরুত্বপূর্ণ: কী এখনো সম্পূর্ণ নয়
এটি একটি starter/prototype, production-ready অ্যাপ নয়। Firebase Android config যোগ করা হয়েছে, কিন্তু বাস্তব OTP login, Firestore-এ request sync, FCM token registration এবং ৩০ কিমি-ভিত্তিক server-side push notification এখনো সংযুক্ত করা হয়নি। `google-services.json` একা Firebase Web SDK-এর config নয়। Firebase Console-এ Authentication → Phone চালু করুন, Firestore তৈরি করুন, এবং Web App register করে Web config সংগ্রহ করুন। FCM nearby notification-এর জন্য secure Cloud Function ও Firestore rules লাগবে।

Leaflet map লোড হতে ইন্টারনেট লাগে। বাস্তব ব্যবহারকারীর তথ্য প্রকাশের আগে authentication, privacy এবং Firestore security rules পরীক্ষা করুন। Firebase Admin private keys কখনো APK-তে রাখবেন না।
