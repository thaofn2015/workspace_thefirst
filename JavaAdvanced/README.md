## Java Advanced (8, 9, ...)
## https://gpcoder.com/3839-gioi-thieu-java-8/

1. InterfaceDemo.java
    Default method: mở rộng interface thì không bị lỗi
    Static method: giống như default nhưng không được overwide

2. FunctionInterfaceDemo.java
    Interface chỉ có một method abstract
    Abc a = () -> x == 0;

3. MethodReferenceDemo.java
    Sử dụng như một tham số của một hàm: method static, method của một instance, constructor
    Sử dụng thay thế cho biểu thức lambda

4. LambdaDemo.java
    Dùng điển triển khai nhanh FunctionalInterface

5. StreamDemo.java
    Khởi tạo stream với kiểu dữ liệu primitive
    ...

6. OptionalDemo.java
    Khởi tạo Optional
    ...

7. PredicateDemo.java
    Sử dụng trong filter

7. ConsumerDemo.java (Supplier tương tự)
    Sử dụng trong forEach

8. FunctionDemo.java
    Sử dụng để tạo hàm chuyển rồi object to object

9. CollectorsDemo.java
    Convert stream thành List, Set, Map
    Sử dụng collectingAndThen, joining, couting, summarizing, groupingby, partitioningBy, reducing
    Custom Collectors

10. DateTimeDemo.java
    LocalDate : Tạo ra 1 instance của date theo tiêu chuẩn ISO 8601, không Time, không Time zone.
    LocalTime : Tạo ra 1 instance của time theo tiêu chuẩn ISO 8601, không Date, không Time zone.
    LocalDateTime : bao gồm cả 2 API trên, tạo ra instance chứa cả Date, Time và không có Time zone.
    ZonedDateTime : bao gồm API LocalDateTime có Time zone.
    Instant : hỗ trợ làm việc với timestamps, được sử dụng để ghi lại thời gian sự kiện trong ứng dụng. Nó lưu trữ dưới định dạng của unix timestamp. Ví dụ: 1970-01-01T00:00:00Z.
    Period : hỗ trợ tính toán năm/ tháng/ ngày giữa 2 Date Time.
    Duration : hỗ trợ tính toán chi tiết đến seconds and nanoseconds giữa 2 Date Time.
    Year : Tạo ra 1 instance của date theo tiêu chuẩn ISO 8601, chỉ có Year.
    YearMonth : Tạo ra 1 instance của date theo tiêu chuẩn ISO 8601, chỉ có Year và Month.
    DayOfWeek, Month Enum : các enum thể hiện các ngày trong tuần, tháng. Hỗ trợ một số thao tác tính toán, biểu diễn ngày trong tuần, tháng.
    ChronoUnit : được sử dụng để đo lượng/ tính toán thời gian như: năm, tháng, ngày, giờ, phút, giây. Ví dụ: YEARS, MONTHS, WEEKS, HOURS, …
    ChronoField : được sử dụng để truy xuất một phần phần nào đó của Date Time. Ví dụ: DAY_OF_MONTH, DAY_OF_WEEK, MONTH_OF_YEAR, YEAR, …

    