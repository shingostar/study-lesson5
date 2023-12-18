package jp.co.kiramex.company.entity;

public class GetterSetterSample {

    public static void main(String[] args) {
        Employee employee = new Employee();
        // employee.employeeName = "大島";カプセル化でコンパイルエラー
        employee.setEmployeeName("大島");   //setterを経由して。値を設定

        String empName = employee.getEmployeeName(); // getterを経由して、値を取得
        System.out.println(empName);   //結果出力
    }

}
