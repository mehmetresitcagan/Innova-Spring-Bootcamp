# Java Spring Bootcamp

BTK - Innova işbirlikli Spring bootcampinde yazdığım kodlar ve sonrasındaki teknik mülakat için hazırladığım soru-cevaplar.



## Hakkında

### 1. Bu proje nedir?

Bootcamp kapsamında bir adet demo proje, bir adet basit kütüphane projesi ve bitirme projesi yaptım.

https://www.btkakademi.gov.tr/portal/public/InnovaJavaSpringBootcamp


### 2. Hangi teknolojiler kullanıldı?

Java, Spring Boot framework, REST API, PostgreSQL, DBeaver, Docker ve Postman.

### 3. Kütüphane Projesi

[Kısaca projenin işleyişini anlatan açıklamalar.]

### 4. Bitirme Projesi

[Cevap]

## Teknik Mülakat Hazırlık Soruları

Aşağıda, teknik mülakatlarda sorulabilecek bazı soru örnekleri ve cevapları bulunmaktadır:

### 1. Java'da liste türleri nelerdir?

- ArrayList: Dinamik bir diziyi temsil eder. Boyutu otomatik olarak ayarlanabilir ve eleman eklemek veya çıkarmak için kullanışlıdır.
- LinkedList: Bağlı listedeki gibi elemanların düğümler halinde saklandığı bir liste türüdür. Eleman ekleme ve çıkarma işlemleri özellikle listenin başı veya sonuyla ilgili işlemlerde hızlıdır.
- Vector: ArrayList'e benzer, ancak senkronize bir yapıya sahiptir. Bu nedenle çoklu iş parçacıklı uygulamalarda kullanılabilir. ArrayList gibi dinamik boyutludur.
- Stack: Yığın veri yapısını uygulayan bir koleksiyon türüdür. LIFO (Son giren, ilk çıkar) mantığına göre çalışır.
- Queue: Kuyruk veri yapısını uygulayan bir koleksiyon türüdür. FIFO (İlk giren, ilk çıkar) mantığına göre çalışır. LinkedList sıklıkla kuyruk olarak kullanılabilir.
- PriorityQueue: Öncelik sırasına göre elemanları saklayan bir koleksiyon türüdür. Öncelik kriterine göre elemanlara erişim sağlar.
- HashSet: Tekrarlayan elemanları içermeyen bir küme (set) koleksiyon türüdür. Elemanlar sırasız bir şekilde saklanır.
- LinkedHashSet: Elemanların eklendiği sırayı koruyan bir küme koleksiyon türüdür.
- TreeSet: Elemanları sıralı bir şekilde saklayan bir küme koleksiyon türüdür. Elemanlar doğal sıralama veya belirtilen bir karşılaştırıcıya göre sıralanabilir.
- HashMap: Key-value çiftlerini saklayan bir harita (map) koleksiyon türüdür. Anahtarlar benzersizdir, yani her anahtar sadece bir değeri gösterir.
- LinkedHashMap: Elemanların eklendiği sırayı koruyan bir harita koleksiyon türüdür.
- TreeMap: Anahtarları sıralı bir şekilde saklayan bir harita koleksiyon türüdür. Anahtarlar doğal sıralama veya belirtilen bir karşılaştırıcıya göre sıralanabilir.

### 2. List ile Arraylist arasındaki fark nedir?

 List terimi bir arayüzü ifade ederken, ArrayList terimi bu arayüzü uygulayan bir koleksiyon sınıfını ifade eder. Diğer liste türleri de aynı List arayüzünü uygulayabilir ve farklı davranışlar sergileyebilir. Bu nedenle, ArrayList yalnızca List arayüzünün bir örneğidir ve Java Collections Framework içindeki farklı koleksiyon türlerini temsil eder.

### 3. DTO nedir ve neden kullanılır?

Spring Boot'ta DTO (Data Transfer Object), veri taşıma amacıyla kullanılan bir sınıftır. Bu, veri tabanı yapılarını veya dış hizmetlerin iç yapısını doğrudan uygulama katmanlarına sızdırmaktan kaçınmanıza yardımcı olur.

Uygulama içerisinde yapısal değişiklikler olduğunda sadece DTO'lar etkilenirken, servis arabirimi veya diğer katmanlar etkilenmez. Genellikle veritabanı veya harici kaynaklardan alınan verileri uygulama katmanları arasında iletmek için kullanılır. DTO'lar, veriyi ayrıştırmak, sadece gereken verileri taşımak, veriyi düzenlemek ve sürüm yönetimi yapmak gibi nedenlerle kullanılır. Bu sayede uygulama daha sürdürülebilir, esnek ve performanslı hale getirilebilir.

### 3. Field injection ve constructor injection nedir?

```
print("hello")
```


