window.onload = () => {
  loadBookList();
  
}

const bookList = new Array();


const loadBookList = () => {
  const bookListOl = document.querySelector(".book-List");

  bookListOl.innerHTML = bookList.map((book) => {
    return`
    <li>
      <span>${book.bookName}</span>
      <span>${book.author}</span>
      <span>${book.publisher}</span>
    </li>
  `;
  }).join("");
};

const addBookOnClickHandle = () =>{
  const book = {
    bookName : document.querySelector(".book-name").value, 
    author : document.querySelector(".author").value,
    publisher : document.querySelector(".publisher").value

  }
  bookList.push(book);
  loadBookList();

};


