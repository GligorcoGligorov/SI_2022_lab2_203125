# SI_2022_lab2_203125
# Втора лабораториска вежба по Софтверско инженерство

# Gligorco Gligorov, бр. на индекс 203125

Control Flow Graph
Фотографија од control flow graph-ot
![Screenshot_1](https://user-images.githubusercontent.com/86534989/168351838-690f611b-83a5-4f9c-9d36-c0258a0f5d4d.png)

Цикломатска комплексност
Цикломатската комплексност на овој код е 9, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=8, па цикломатската комплексност изнесува 9.

Тест случаи според критериумот Every statement
![Screenshot_3](https://user-images.githubusercontent.com/86534989/168360099-adbb9217-b7ad-4006-9c9c-cf7fbc37de5e.png)



Тест случаи според критериумот Every branch
![Screenshot_2](https://user-images.githubusercontent.com/86534989/168360717-fe47df59-f946-4e1e-9b30-29976fb19ddf.png)


Објаснување на напишаните unit tests

Тестовите што ги користеме за every statement се функционални и за every branch.

Првиот тест го тестираме со assertEquals(list, SILab2.function(resList)) каде list ни е листата што очекуваме да биде вратена после функцијата funkction(resList).

Во вториот тест гористеме assertThrows(IllegalArgumentException.class, () -> SILab2.function(exList)) каде очекуваме да ни биде фрлен исклучок од тип IllegalArgumentException затоа што условот if (rootOfN * rootOfN  != n) е исполнет.

Во третиот тест гористеме assertThrows(IllegalArgumentException.class, () -> SILab2.function(exList)) каде очекуваме да ни биде фрлен исклучок од тип IllegalArgumentException затоа што условот if  if (list.size() <= 0) е исполнет.
