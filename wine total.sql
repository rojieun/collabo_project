create table wineTBL(
no int not null auto_increment,
name varchar(200),
country varchar(30),
type varchar(30),
sweet int,
body int,
price int,
company varchar(200),
vintage int,
food varchar(2000),
PRIMARY KEY(no));

-- 데이터 추가
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('무똥 까데 레드(Mouton Cadet Red)','프랑스','레드',1,2,40000,'바롱 필립 드 로칠드(Baron Philippe de Rothschild)',2012,'각종 육류요리, 치즈, 살라미, 그릴에 구운 음식, 버섯요리와 잘 어울린다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('샤또 바리(Chateau Barit)','프랑스','레드',1,5,24000,'샤또 바리(Chateau Barit)',2003,'돈까스, 잡책, 갈비, 로스트 치킨 등과 잘 어울린다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('샤또 몽페라 루즈(Chateau Mont Perat Rouge)','프랑스','레드',1,5,91000,'데스빠뉴(Despagne)',2012,'로스트 안심과 등심, 진한 소스의 육류, 오래된 숙성 치즈 등과 잘 어울린다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('샤또 물랭네프 메독(Chateau Moulin Neuf Medoc)','프랑스','레드',3,3,86000,null,null,'치즈가 가미된 파스타와 피자, 치킨 등과 또는 삼겹살과도 궁합이 좋습니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('샤또 라모스 베르즈롱 오 메독(Chateau Lamothe Bergeron Haut-Medoc)','프랑스','레드',3,3,50000,'샤또 라모스 베르즈롱(Chateau Lamothe Bergeron)',1993,null);
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('샤또 레 세사르뜨(Chateau Les Essarts)','프랑스','레드',1,5,44000,'비노블 길레(S.C.E.A. Vignobles Gillet',2004,'구운 고기, 가메, 치즈 등과 어울린다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('시쉘 생떼스떼프(Sichel Saint-Estephe)','프랑스','레드',3,3,60000,'시쉘(Sichel)',2001,null);
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('샤셀 루지(꼬뜨 뒤 루베통 레드)(Chancel Rouge)','프랑스','레드',1,3,30000,'Chancel',2003,'양고기, 붉은 육류요리');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('샤또 따이약 라 로자 마고(Chateau Tayac La Rauza)','프랑스','레드',1,3,110000,'시쉘(Sichel)',2003,'흰살 육류와 가금류와 잘 어울린다. 숙성된 와인일수록 치즈,붉은 육류, 버섯과 함께 요리한 사냥고기(프와그라-거위간 요리)등과 완벽한 매치를 이룬다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('샤또 라퐁 로쉐(Chateau Lafon Rochet)','프랑스','레드',1,4,140000,'샤또 라퐁 로쉐(Chateau Lafon-Rochet)',2002,'붉은 고기류 및 스테이크 혹은 치즈류 등과 잘 어울린다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('샤또 라모스 루지(Chateau Lamothe Louge)','프랑스','레드',3,3,50000,'CHATEAU LAMOTHE',2010,'구운 육류, 까망베르나 브리 치즈와 잘 어울린다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('샤또 옴 브랭(Ch. Orme Brun)','프랑스','레드',1,5,76000,'샤또 옴 브랭(Chateau Orme Brun)',2003,'서양요리뿐 아니라 동양의 요리와도 잘 어울리며 특히 붉은 육류요리와 최상의 조화를 이룬다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('샤또 페르모랭(Chateau Peyremorin)','프랑스','레드',1,5,50000,'샤또 페르모랭(Chateau Peyremorin)',2004,'가금류, 한식요리, 스테이크 요리와 잘 어울린다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('조 라 모뜨 메독(Jo La Motte Medoc)','프랑스','레드',3,3,33000,'조 라 모뜨(Jo La Motte)',2003,'등심, 티본스테이크, 양고기, 초콜릿 케이크 등과 잘 어울린다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('샤또 몽포콩 레 가뎃뜨(Chateau de Monfaucon Les Gardettes)','프랑스','레드',1,5,35000,'샤또 몽푸콩(Chateau Montfaucon)',2005,'지중해식 요리 또는 약간의 스파이스가 가미된 음식과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('레 부릴렐레 드 베이슈빌 오메독(Les Brulieres de Beychevelle)','프랑스','레드',3,3,54000,'샤또 베이슈빌(Ch. Beychevelle)',1998,null);
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('비쇼 보졸레 빌라쥐(Albert Bichot Beaujolais Villages)','프랑스','레드',2,4,37000,'비쇼(Maison Albert Bichot)',2004,null);
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('비쇼 꼬뜨 뒤 론(Albert Bichot Cote du Rhone)','프랑스','레드',2,3,40000,'비쇼(Maison Albert Bichot)',2005,'모든 육류와도 잘 조화를 이루는 고급와인 입니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('마주앙 라 세느(Majuang La Seine)','프랑스','화이트',4,1,17000,'C.F.G.V',null,null);

insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('캥거루 리지 쉬라즈(Kangaroo Ridge Shiraz)','호주','레드',1,3,27000,'KANGAROO RIDGE WINES',2012,'스테이크, 바베큐 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('도미닉 베르사체 맥라렌 베일 쉬라즈 리저브(Dominic Versace McLaren Vale Shiraz Reserve)','호주','레드',0,5,160000,'도미닉 베르사체(DOMINIC VERSACE)',2002,'바비큐, 스테이크 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('테라 바로사 쉬라즈(Thorn Clarke Terra Barossa Shiraz)','호주','레드',1,5,50000,'쏜 클락(Thorn-Clarke)',2005,'갈비, 보쌈, 스테이크 등의 육류요리, 치즈, 삼겹살, 불고기, 튀김, 볶음요리, 해물요리등과도 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('제이콥스크릭 멜롯(Jacobs Creek Merlot)','호주','레드',1,3,25000,'제이콥스 크릭(Jacobs Creek)',null,'비프 스테이크, 양고기 스튜, 오리가슴 샐러드, 버섯요리, 고다치즈와 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('울프 블라스 옐로우 라벨 까베르네 소비뇽(Wolf Blass Yellow Label Cabernet Sauvignon)','호주','레드',2,4,64000,'울프 블라스(Wolf Blass)',2003,'구운 양고기, 구운 육류, 오삼 불고기, 매운 갈비찜, 붉은고기 요리와 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('울프 블라스 프레지던트 쉬라즈(Wolf Blass President Shiraz)','호주','레드',1,4,76000,'울프 블라스(Wolf Blass)',2003,'팔보채, 돼지불고기, 탄두리치킨, LA갈비 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('스톤해븐 리미티드 빈야드 릴리즈 쉬라즈(StoneHaven Limited Vineyard Release Shiraz)','호주','레드',2,3,86000,'하디 와인(Hardy Wine Company)',1999,'쇠고기, 양고기, 야생 동물 고기 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('울프 블라스 프레지던트 까베르네 쇼비뇽(Wolf Blass President Cabernet Sauvignon)','호주','레드',1,4,76000,'울프 블라스(Wolf Blass)',2003,'허브향이 강한 지중해식 파스타, 소갈비찜, 와규 스테이크 등과 즐기면 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('옐로우테일 쉬라즈(Yellow Tail Shiraz)','호주','레드',2,4,20000,'카셀라 와인(Casella Wines)',2011,'육류, 바비큐, 강한 향의 치즈 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('브라운 브라더스 모스카토 로사(Brown Brothers Moscato Rosa)','호주','스파클링',4,3,38000,'브라운 브라더스(Brown Brothers)',2012,'달콤한 과일계열 디저트, 말린 무화과, 블루 치즈 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('브라운 브라더스 모스카토(Brown Brothers Moscato)','호주','스파클링',4,2,38000,'브라운 브라더스(Brown Brothers)',2012,'디저트 음식, 가벼운 스낵, 치즈 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('팬마라 스윗 팩토리(Penmara Sweet Factory)','호주','화이트',5,4,50000,'Penmara wines',null,'디저트류와 잘 어울리고 특히 레몬타르트나 라임타르트와 같이 시트러스가 들어간 디저트들과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('팬마라 골든 그레이스(Penmara Golden Light)','호주','화이트',5,4,40000,'Penmara wines',null,'디저트류와 잘 어울리고 특히 레몬타르트나 라입 타르트와 같이 시트러스가 들어간 디저트들과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('울프 블라스 프레지던트 샤도네이(Wolf Blass President Chardonnay)','호주','화이트',1,3,76000,'울프 블라스(Wolf Blass)',2003,'왕새우, 랍스터, 수육, 갈치조림, 아구찜, 모짜렐라 소스와 토마토, 생선회와 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('옐로우 테일 샤도네이(Yellow Tail Chardonnay)','호주','화이트',2,3,20000,'카셀라 와인(Casella Wines)',2007,'대부분의 해산물, 생선류, 닭고기, 칠면조, 생선회 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('빈222 샤도네이(BIN 222 Chardonnay)','호주','화이트',1,3,38000,'윈담 이스테이트(Wyndham Estate)',2005,'다양한 종류의 닭고기 요리, 해산물요리, 굴, 산채정식, 돼지고기, 해물전, 연어요리, 베이글, 까망베르치즈 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('파란드리 샤도네이(Palandri Chardonnay)','호주','화이트',2,3,50000,'파란드리(Palandri)',2001,'해산물 요리, 과일샐러드, 치즈 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('맥퍼슨 샤도네이(McPherson Chardonnay)','호주','화이트',2,3,30000,'맥펄슨(Mc Pherson)',2001,'일식 요리, 조개류 및 생선류 요리와 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('제이콥스크릭 샤도네이(Jacobs Creek Chardonnay)','호주','화이트',2,3,25000,'제이콥스크릭(Jacobs Creek)',null,'치킨요리, 해산물요리, 돼지고기 구이, 파스타, 샐러드, 샌드위치, 까망베르치즈 등과 잘 어울립니다.');

insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('몬테스 클래식 까베르네 소비뇽(Montes Classic Cabernet Sauvignon)','칠레','레드',1,4,25000,'몬테스(Montes)',2013,'모든 붉은 육류, 돼지갈비, 참치회등의 붉은 살과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('몬테스 클래식 멜롯(Montes Classic Merlot)','칠레','레드',1,5,25000,'몬테스(Montes)',2014,'로스트한 육류, 양념 갈비, 볶은 버섯, 연어 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('1865 리미티드 에디션(Limited Edition)','칠레','레드',1,5,100000,'산 페드로(San Pedro)',2011,'소고기, 돼지고기의 모든 육류 요리와 치즈 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('알마비바(Almaviva)','칠레','레드',1,5,300000,'비냐 알마비바(Vina Almaviva)',2013,'약간 강한 양념으로 조리된 육류, 파스타, 라자냐, 햄 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('1865 싱글 빈야드 까르미네르(1865 Single Vineyard Carmenere)','칠레','레드',2,5,55000,'산 페드로(San Pedro)',2014,'로스트 비프, 각종 육류요리와 파스타, 베이컨, 햄버거, 피자 등의 간편한 요리와도 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('몬테스 알파 쉬라(Montes Alpha Syrah)','칠레','레드',1,5,52000,'몬테스(Montes)',2013,'석쇠에 구운 육류, 머스타드 소스를 곁들인 스테이크, 송아지요리, 육즙이 풍부한 쇠고기요리등과 함께하기 좋습니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('알리 플러스 리미티드 릴리즈(Yali PLUS Limited Release)','칠레','레드',1,5,190000,'비냐 벤띠스케로(Vina Ventisquero)',2011,'진한 소스의 스테이크, 스튜 등 서양식 소고기요리와 좋은 궁합을 이루고, 진한 양념의 닭고기요리, 오리양념구이 등 전반적인 육류요리와 일품의 조화를 이룹니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('몬테스 퍼플엔젤(Montes Purple Angel)','칠레','레드',1,5,150000,'몬테스(Montes)',2009,'강하지 않게 양념된 붉은 육류 요리, 볶음 요리, 해물요리등과도 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('쿠지노 마쿨 피니스 떼라에(Cousino Macul Finis Terrae)','칠레','레드',1,5,100000,'쿠지노 마쿨(Cusion Macul)',2009,'육류, 스테이크와 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('1810 까르미네르(Casa Donoso 1810 Carmenere)','칠레','레드',1,5,90000,'카사도노소(Casa Donoso)',2001,'양고기, 붉은 살의 고기류, 연한 연어요리, 크림소스 파스타');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('에스쿠도 로호 샤도네이(Escudo Rojo Chardonnay)','칠레','화이트',2,3,47000,'바롱 필립 드 로칠드 칠레(Baron Philippe de Rothschild Maipo Chile)',2008,'샐러드, 닭요리 및 신선한 해산물');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('몬테스 알파 샤도네이(Montes Alpha Chardonnay)','칠레','화이트',2,3,48000,'몬테스(Montes)',2014,'훈제연어, 생굴, 크림소스로 조리한 생선류, Oily한 스파게티 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('카사실바 콜렉시온 샤도네이(Casa Silva Coleccion Chardonnay)','칠레','화이트',1,3,30000,'카사 실바(Casa Silva)',2004,null);
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('비냐 라로사 샤도네이(Vina La Rosa Chardonnay)','칠레','화이트',2,2,28000,'비나 라로사(Vina La Rosa)',2002,'단독으로 드셔도 좋고 대부분의 생선이나 해물요리, 커리소스를 얹은 파스타나 치즈와 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('카르멘 샤도네이(Carmen Chardonnay)','칠레','화이트',1,1,20000,'카르멘(Vina Carmen)',2006,'식전주, 굴, 새우, 바닷가재 요리, 해물샐러드, 닭고기나 칠면조 요리, 크림소스파스타, 찜냄비 요리 등과 잘 어울립니다.');

insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('피브 투웬티 스트로베리 모스카토(FEV 20 STRAWBERRY MOSCATO)','이태리','로제',4,2,25000,'C.V.C srl-GATTINARA-ITALY',null,'디저트류 과일류와 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('피브 투웬티 피치 모스카토(FEV 20 PEACH MOSCATO)','이태리','화이트',4,2,25000,'C.V.C srl-GATTINARA-ITALY',null,'닭고기, 푸딩, 초콜릿 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('바바 또우 비앙코(Bava Thou Bianco)','이태리','화이트',1,3,40000,'바바 코코나토(BAVA Cocconato',2003,'다양한 음식과 잘 어울리지만 특히 중국요리와 잘 어울립니다. 유산슬, 깐쇼새우, 깐풍기, 바닷가재구이 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('코르테 지아라 소아베(Corte Giaara Soave Pagus)','이태리','화이트',2,3,24000,'코르테 지아라-알레그리니 그룹',2002,'해산물 요리, 허브를 넣은 리조토, 간장 소스를 넣은 국수, 아스파라거스 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('카스텔 베끼오 비앙코(Castelvecchio Bianco)','이태리','화이트',2,0,25000,'까스텔베끼오(Castelvecchio',null,null);
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('자르데또 포르세코 엑스트라 드라이(Zardetto Prosecco Extra Dry)','이태리','화이트',2,1,40000,'자르데또(Zardetto)',null,'피자, 조개요리, 생선튀김, 매콤한 아시아 요리, 까망베르 치즈 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('카사노 마르살라(Casano Marsala FIne)','이태리','화이트',5,5,36000,'Carlo Pellegrino',null,'시간과 장소에 구애받지 않고 와인 자체만으로도 충분히 즐길 수 있으며, 패스트리류, 디저트 등 달콤한 음식 등과 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('요리오 화이트(Jorio Blanc)','이태리','화이트',1,3,46000,'우마니 론끼',2014,'생선요리나 해산물 파스타, 리조또, 그릴에 구운 흰살코기 요리나 신선한 치즈와 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('빌라엠 뮤스카텔(Vila M Muscatel)','이태리','화이트',5,1,35000,'지아니 갈리아도(Gianni Gagliardo',2009,'간단한 다과류, 케익류, 디저트류와 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('또스띠 똘라스코 모스까또 다스띠(Tosti Torlasco Moscato d Asti)','이태리','화이트',4,2,60000,'Tosti',2013,'과일 타르트, 케익, 떡, 디저트류와 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('코르테 지아라 발폴리첼라 클라시코(Corte Giala Valpolicella)','이태리','레드',1,5,25000,'꼬드 지아라(Corte Giala',null,'파스타, 계절스프, 햄, 살라미, 돼지고기요리와 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('카사블랑카(Casablanca)','이태리','레드',5,0,20000,'C.V.C srl-GATTINARA-ITALY',null,'붉은색 고기와 잘 어울리며 식후 디저트 와인으로 좋습니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('카스텔로 반피 센티네(Castello Banfi Centine)','이태리','레드',1,3,40000,'반피(BANFI)',2004,'닭, 오리, 꿩 등 가금류 요리와 잘 어울립니다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('진자노 띠지아노(Cinzano Tiziano)','이태리','레드',3,3,28000,'진자노(Cinzano)',null,'식전주로 마시기도 하며 샐러드, 파스타와 잘 어울립니다.');



insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('세게지오 홈 랜치 진판델(Seghesio, Home Ranch Zinfandel)','미국','레드',0,5,240000,'세게지오(Seghsio)',null,'커리, 매운갈비, 베이컨이나 햄류, 양고기, 체다 치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('세게지오 올드 바인 카운티 진판델(Seghesio Old Vine County Zinfandel)','미국','레드',0,4,170000,'세게지오(Seghsio)',null,'커리, 매운갈비, 베이컨이나 햄류, 양고기, 체다 치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('세게지오 소노마 카운티 진판델(Seghesio Sonoma County Zinfandel)','미국','레드',0,4,120000,'세게지오(Seghsio)',null,'커리, 매운갈비, 베이컨이나 햄류, 양고기, 체다 치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('세인트 프란시스, 소노마 카운티 까베르네소비뇽(St. Francis, Sonoma County Cabernet Sauvignon)','미국','레드',0,5,127000,'세인트 프란시스(St.Francis)',null,'숙성된 블루 치즈나 까망베르 등 향이 진한 치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('샤또 삐뽀 2011 생테밀리옹 그랑크뤼(Chateau Pipeau, Saint Emilion Grand Cru)','프랑스','레드',0,4,140000,'샤토 삐뽀(chateau Pipeau)',null,'바비큐 및 그릴, 구이한 쇠고기, 버섯구이, 까망베르 치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('세인트 프란시스, 소노마 카운티 샤르도네(St. Francis, Sonoma County Chardonnay)','미국','화이트',0,2,95000,'세인트 프란시스(St.Francis)',null,'조개찜, 조개구이, 게, 새우 구이, 파스타 ,흰살 생선');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('보데가 피놀드, 가우디아나 블랑코(Gaudiana Blanco)','스페인','화이트',0,4,140000,'보데가 피놀드(Bodegas Pinord)',null,'갑각류 및 조개, 바질 페스토 파스타, 회, 흰살 생선');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('라 뷔띠니에르 샤르도네(La Butiniere Chardonnay)','프랑스','화이트',5,3,64000,'꺄브 안느 드 조와이유스(Cave Anne de Joyeuse)',null,'관자 요리, 팬 프라이 새우, 해산물 전채요리, 치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('까마스 샤르도네(CAMAS Chardonnay)','프랑스','화이트',0,1,36000,'꺄브 안느 드 조와이유스(Cave Anne de Joyeuse)',null,'조개 찜,생선 구이, 랍스터나 게 요리,아시안 푸드');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('까마스 소비뇽 블랑(CAMAS Sauvignon Blanc)','프랑스','화이트',0,1,36000,'꺄브 안느 드 조와이유스(Cave Anne de Joyeuse)',null,'조개 찜,생선 구이, 랍스터나 게 요리,아시안 푸드');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('렉셀렁스 데 뮈레르 프로방스 로제(L Excellence des Muraires)','프랑스','로제',0,2,100000,'베르나르 마그레즈(Bernard Magrez)',null,'연어 카르파치오, 냉파스타, 과일 타르트 및 디저트');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('레 뮈레르 두쓰 비 (프로방스 로제)(Les Muraires Douce Vie)','프랑스','로제',0,2,53000,'베르나르 마그레즈(Bernard Magrez)',null,'연어 카르파치오, 냉파스타, 과일 타르트 및 디저트');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('레알체, 로사도 보발(Realce, Rosado Bobal)','스페인','로제',0,1,24000,'유니온 캄페시나 이니에스텐스',null,'리조또, 파스타, 생선류와 어패류');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('디오라마 컬렉션 피노누아 로제(Diorama Collection Pinot Noir Rose)','스페인','로제',0,2,52000,'보데가 피놀드(Bodegas Pinord)',null,'라구 소스, 가벼운 칠리나 토마토 베이스의 파스타');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('샤토 리카르델, 비넬라크로아 로제(Chateau Ricardelle Vignelacroix Rose)','프랑스','로제',0,3,75000,'샤토 리카르델(Chateau Ricardelle)',null,'육류요리, 구운 야채, 에피타이저 및 구운 생선');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('볼랭저, 스페셜 뀌베 브뤼(NV Bollinger, special Cuvee Brut)','프랑스','샴페인',0,3,152000,'볼랭져(Bollinger)',null,'전채요리와 모든 음식, 굴 , 딸기, 생선회');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('루이 마씽, 리저브(NV Rouis Massing Reserve NV)','프랑스','샴페인',0,3,120000,'루이 마씽(Louis Massing)',null,'식전주, 아페리티프, 해산물, 가금류 요리');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('라헤르트 프레르 브룻 트라디시옹(NV Laherte Freres Tradition Brut NV)','프랑스','샴페인',0,3,88000,'라헤르트 프레르(Laherte Freres)',null,'전채요리, 생선요리, 식전/식중/식후');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('돔 페리뇽 빈티지 2004(Dom perignon Vintage 2004)','프랑스','샴페인',0,3,350000,'모엣 샹동(Moet & chandon)',null,'식전/식중/식후 멀티, 에피타이저, 수프, 야채, 흰살 생선, 닭 가슴살');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('크루그 그랑 퀴베 브륏(NV Krug Grande Cuvee NV)','프랑스','샴페인',0,2,400000,'크루그(Krug)',null,'어떤 음식에나 어울릴 수 있는 스펙트럼이 넓은 샴페인');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('마루가 그랑 레세르바 까바 브뤼 밀레짐(Marrugat Gran Reserva CAVA Brut Millesime)','스페인','스파클링',0,2,66000,'보데가 피놀드(Bodegas Pinord)',null,'전채 요리, 튀김 요리, 흰살 생선, 안심스테이크');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('마루카 까바 브륏(Marrugat CAVA Brut)','스페인','스파클링',0,2,47000,'보데가 피놀드(Bodegas Pinord)',null,'과일, 햄, 피자, 치킨, 가금류 요리, 흰살 생선');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('마루가 까바 그랑 브륏 리저브(Marrugat CAVA Grand Brut Reserve)','스페인','스파클링',0,2,60000,'보데가 피놀드(Bodegas Pinord)',null,'전채 요리, 튀김 요리, 흰살 생선, 게/새우 랍스타');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('라 또르데라, 브루네이 프로세코 슈퍼리오레(La Tordera, Brunei Prosecco Superiore)','이태리','스파클링',0,2,53000,'라 또르데나(La Tordera)',null,'크림소스 리조또나 파스타, 람스터 및 게/새우, 샐러드나 튀김');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('라 또르데라, 사오미 프로세코(La Tordera, Saomi Prosecco)','이태리','스파클링',0,2,48000,'라 또르데나(La Tordera)',null,'전채요리, 아시아 음식, 샐러드, 튀김, 까르보나라');


insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('헤지스 cms화이트(Hedges CMS White)','미국','화이트',2,3,39000,'헤지스(Hedges)',2004,'굴,게,가리비등과 아주 잘 어울리며 아페리티프로도 아주 좋다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('켄달잭슨 빈트너스 리저브 샤도네이(Kendall Jackson Vintners Reserve Chardonnay)','미국','화이트',1,3,65000,'켄달 잭슨(Kendall-jackson)',2012,'굴,게,어패류,파스타,샐러드,과일,치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('트리니티 오크 화이트 진판델(Trinity Oaks White Zinfandel)','미국','화이트',1,3,30000,'트리니티 오크(Trinity Oaks)',2002,'다양한 음식과 다 잘 어울린다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('실버오크 나파 밸리(Silver Oak Napa Valley)','미국','레드',1,5,476000,'실버 오크(Silver Oak Winery)',null,'베이컨,하몽,살라미,바비큐 요리');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('실버오크 알렉산더 밸리(Silver Oak Alexander Valley 2009)','미국','레드',1,5,300000,'실버 오크(Silver Oak Winery)',2012,'고급 안심,등심 스테이크,야채,바비큐요리,숙성된 치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('죠셉 펠프스 까베르네 쇼비뇽(Joseph Phelps Cabernet Sauvignon)','미국','레드',1,4,190000,'조셉 펠프스빈야드(Joseph Phelps Vineyards)',2010,'가금류 고기구이,스테이크,버섯구이,치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('로버트 몬다비 우드브릿지 까베르네 소비뇽(Robert Mondavi Woodbridge Cabernet Sauvignon)','미국','레드',1,4,48000,'로버트 몬다비(Robert Mondavi)',2012,'소고기,돼지고기,닭고기');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('모건 데이비드 콩코드(Mogen David Concord)','미국','레드',5,0,12000,'모건 데이비드(Mogen David)',null,'부드러운 치즈,고급 스테이크');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('아발론 나파밸리 까베르네 쇼비뇽(Avalon, Napa Valley Cabeernet Sauvignon 2011)','미국','레드',0,4,80000,'Avalon winery',2014,'스테이크,파스타,닭고기,돼지고기,치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('오크빌 랜치 까베르네 쇼비뇽(Oakville Ranch Cabernet Sauvignon)','미국','레드',1,5,280000,'오크빌 랜치 빈야드(Oakville Ranch vineyards)',2004,'비프 스테이크,양고기,오리 꽁피');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('셔터홈 까베르네 쇼비뇽(Sutter Home Cabernet Sauvignon)','미국','레드',2,3,23000,'SUTTER HOME WINERY',2011,'치킨,육류,가금류,순하게 양념한 파스타');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('헤지스 쓰리빈야드 까베르네 멜롯(Medium-Dry)','미국','레드',1,5,80000,'헤지스(Hedges)',2003,'양고기,안심요리,송로버섯,고다치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('켄달잭슨 빈트너스 리저브 까베르네 소비뇽(Kendall-Jackson,Vintners Reserve Cabernet Sauvignon)','미국','레드',1,5,68000,'켄달 잭슨(Kendall Jackson)',2013,'육류,진한소스 파스타,치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('콜럼비아 크레스트 그랜드 이스테이트 까베르네 쇼비뇽(Columbia Crest Grand Estates Cabernet Sauvignon)','미국','레드',1,3,45000,'콜럼비아 크레스트 와이너리',null,'등심 스테이크,라자냐,치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('죠셉 펠프스 이니스프리 카버네 소비뇽(Joseph Phelps lnnisfree Cabernet Sauvignon)','미국','레드',1,4,89000,'죠셉 펠프스(Joseph Phelps Vineyards)',2009,'비프 스테이크,양고기,오리 꽁피');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('끌로 뒤 발 까베르네 쇼비뇽(Clos Du Val Cabernet Sauvignon)','미국','레드',1,5,180000,'끌로 뒤발(Clos Du Val)',2011,'소고기 스튜,치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('모젤 크리스마스 로제(Mosel Christmas Rose)','독일','로제',4,2,50000,'SMW',null,'달콤한 과일 디저트,말린 무화과,블루치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('모젤 크리스마스 리슬링(Mosel Christmas Riseling)','독일','화이트',4,2,50000,'SMW',null,'쿠키,말린과일,간단한 카나페,과일 칵테일,초콜릿,퐁듀');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('헨겔 트로켄(Henkell Trocken)','독일','화이트',1,0,15000,'헨켈(Henkell)',null,'해산물,초밥,바베큐');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('클루세라터 상트 미카엘 슈페트레제(Klusserather St.Michael Spatlese)','독일','화이트',2,2,16000,'Zimmermman Graeff & Muller',null,'null');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('블루넌 아이스바인 실바너(Blue Nun Eiswein Silvaner)','독일','화이트',5,4,50000,'랑구스(Langguth)',2012,'케익,치즈.과일.디저트');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('베른가스틀러 아우스레제(Bernkasteler Auslese)','독일','화이트',2,3,30000,'짐머만 그레프 뮐러(Zimmermman Graeff Muller)',2001,'캘리포니아식 요리,케익,매운 음식');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('버니니 클래식(Medium Sweet)','남아공','화이트/스파클링',4,1,5500,'Distell.LTD',null,'피자,파스타,스시,샐러드.쿠키,말린과일,카나페');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('버니니 블러쉬(BERNINI BLUSH)','남아공','로제/스파클링',4,1,5500,'distell.LTD',null,'피자,파스타,스시,샐러드.쿠키,말린과일,카나페');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('베이어스클루프 피노타지','남아공','레드',1,3,38000,'베이어스클루프(Beyerskloof)',2008,'해산물,스테이크,파스타,매콤한 음식');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('실리니 셀러 셀렉션 쇼비뇽 블랑(Sileni Cellar Selection Sauvignon Blanc)','뉴질랜드','화이트',2,3,33000,'실리니 에스테이트(Sileni Estate)',2014,'해산물,봄나물,생선찜,샐러드');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('킴 크로포드 말보로 쇼비뇽 블랑(Kim Crawford Marlborough Sauvignon Blanc)','뉴질랜드','화이트',1,3,45000,'킴 크로포드(Kim Crawford)',null,'아스파라거스,샐러드,해산물,굴');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('마히 피노누아(Mahi Pinot Noir)','뉴질랜드','레드',1,2,90000,'마히',2012,'비프 스테이크,양고기,오리 꽁피');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('써니 힐스 크람포시(Sunny Hills Cramposie)','루마니아','화이트',1,1,30000,'null',2006,'구운 생선요리,조개류 및 흰살고기');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('캐슬브룩 머스캣 오토넬(Sweet)','루마니아','화이트',4,1,20000,'캐슬브룩(Castlebrook)',2011,'굴,게,가리비등과 아주 잘 어울리며 아페리티프로도 아주 좋다.');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('캐슬브룩 까베르네 쇼비뇽(Catlebrook Cabernet Sauvignon)','루마니아','레드',1,5,20000,'캐슬브룩(Castlebrook)',2013,'비프 스테이크,양고기,오리 꽁피');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('무스캇 사모스 쿠르타키(MUSCAT SAMOS KOURTAKI)','그리스','화이트',5,0,50000,'그릭 와인 셀러스 디 쿠르타키 에스에이(GREEK WINE CELLARS D.KOURTAKIS S.A)',null,'디저트음식,간단한 파르페,초콜릿');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('마르로닷핀 파트라스 쿠르타키(Sweet)','그리스','레드',5,0,50000,'그릭 와인 셀러스 디 쿠르타키 에스에이(GREEK WINE CELLARS D.KOURTAKIS S.A)',null,'계절과일,간단한 치즈');
insert into winetbl(name, country, type, sweet, body ,price, company, vintage,food)
values ('비날 아이스와인 화이트(Vinal ice White)','불가리아','화이트',5,3,40000,'비날(Vinal)',2014,'치즈,달콤한 과일,푸딩,파이,각종 케이크');




-- 전체 조회
select * from winetbl;

drop table winetbl;