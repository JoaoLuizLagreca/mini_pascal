PROGRAM condicional;

INT resp;

begin
    write('Quanto é 1+1?');
    read(resp);
    IF (resp = 2) THEN
        write('Acertou mizeravi')
    ELSE
        BEGIN
            write('Errou');
            write('A resposta correta é 2')
        END
end.
