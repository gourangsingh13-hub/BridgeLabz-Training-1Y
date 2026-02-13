class pen_division {
    public static void main(String[] args){
        int total_pens = 14,student=3;
        int pens_per_student = total_pens / student;
        int remaining_pens = total_pens % student;
        System.out.println("The Pen Per Student is " + pens_per_student);
        System.out.println(" and the remaining pen not distributed is " + remaining_pens);
    }
}