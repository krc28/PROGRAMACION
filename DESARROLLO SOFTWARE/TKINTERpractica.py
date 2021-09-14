from tkinter import * 
main_window = Tk()
main_window.title ("Chiss")
main_frame = Frame (main_window, 
                    bg = "#FF1493", 
                    height = 500 , 
                    width = 500 , 
                    padx = 50 , 
                    pady = 50, 
                    cursor = "arrow")
main_frame.pack()
title_label = Label(main_frame, 
                    text = "Hola soy el animalito",
                    font= ("Times New Roman", 18),
                    fg = "#FF1493",
                    justify= CENTER)
title_label.pack()
imagen = PhotoImage(file = "FUNDAMENTOS-DE-PROGRAMACION\EJERCICIOS\chis.png")
img_label = Label(main_frame, 
                  image = imagen,
                  bg = "#FF1253")              
img_label.pack()
def accion_button():
    global boton_text
    if boton_text == "Saluda a chis aquí":
        boton_text = "Hola chis"
    else:
        boton_text = "Saluda a chis aquí"
    boton.config(text = boton_text)
boton_text = "Saluda a chis aquí"
boton = Button (main_frame,
                text = "Saluda a chis aquí",
                bg = "#FF5522",
                fg = "#FF0652",
                command= accion_button)
boton.pack()
main_window.mainloop()